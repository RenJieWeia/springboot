function login() {
    let accountId = document.getElementById("accountId");
    let password = document.getElementById("password");
    let param= '{"accountId":"'+accountId.value+'","password":"'+password.value+'"}'
    JSON.parse(param)
    let xhr = new XMLHttpRequest();
    xhr.open("POST","login");
    xhr.setRequestHeader("Content-Type","application/json")
    xhr.onreadystatechange=function (){
        if(xhr.readyState==4){
            let result=JSON.parse(xhr.response)
            if (result.status!=200){
                alert(result.msg)
            }
        }else {
            window.location.href="/home"
        }
    }
    xhr.send(param);
}
