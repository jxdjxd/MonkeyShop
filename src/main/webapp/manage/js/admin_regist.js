$(function(){
            $("input#submit").click(function(){

                var userName = $("input#userName").val();
                var password = $("input#password").val();
                var surePassword = $("input#surePassword").val();

                reg_userName = /^[a-z0-9A-Z\u2E80-\u9FFF_-]{1,10}$/;
                reg_password = /^[a-z0-9A-Z]{6,10}$/;

                if(userName.length>10){
                	alert("用户名字符长度不能大于10！");
                	return false;
                }
                
                if(!reg_userName.test(userName)){
                    alert("用户名只能包含中文、英文字符、数字、-和_");
                    return false;
                }
                
                if(password.length>10 || password.length<6){
                	alert("密码应为6-10个字符");
                	return false;
                }
                
                if(!reg_password.test(password)){
                    alert("密码只能包含英文字符、数字、-和_");
                    return false;
                }

                if(password!=surePassword){
                    alert("两次密码不相同！");
                    return false;
                }

            });
        });