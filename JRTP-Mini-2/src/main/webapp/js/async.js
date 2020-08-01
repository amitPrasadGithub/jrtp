            $(document).ready(function(event) {
                $("#emailId").blur(function() {
                    $("#duplicateEmail").html("");
                    $("#availableEmail").html("");
                    $.ajax({
                        type    :   "GET",
                        url     :   "validateEmail",
                        data    :   {
                                    "email" :   $("#emailId").val()
                        },
                        success :   function(res) {
                            if(!res) {
                                $("#duplicateEmail").html("Email already registered");
                                $("emailId").focus();
                            }
                            else {
                                $("#availableEmail").html("Available");
                            }
                        },
                        error   :   function() {
                            //code
                        }
                    })
                });

                $("#countryId").change(function() {
                    $("#stateId").html("");
                    $("#cityId").html("");

                    $.ajax({
                        type    :   "GET",
                        url     :   "/getStateList",
                        data    :   {
                            "countryId" :   $("#countryId").val()
                        },
                        success :   function(res) {
                            $.each(res, function(stateId, stateName) {
                                $('<option>').val(stateId).text(stateName).appendTo("#stateId");
                            });
                        }
                    });
                });

                $("#stateId").change(function() {
                    $("#cityId").html("");
                    $.ajax({
                        type    :   "GET",
                        url     :   "getCities",
                        data    :   {
                            "stateId"   :   $("#stateId").val()
                        },
                        success :   function(res) {
                            $.each(res, function(cityId, cityName) {
                                $('<option>').val(cityId).text(cityName).appendTo("#cityId");
                            })
                        }
                    })
                })
            })
