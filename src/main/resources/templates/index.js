var idName = 1;
function displayValue() {
    var deleteId = `delete_${idName}`;
    var a = document.getElementById("name").value;
    var b = document.getElementById("phone").value;
    var c = document.getElementById("email").value;
    var emailval = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

    if(a=="" || b=="" || c=="") {
        alert("Any field cannot be left empty. Please fill the form again.");
    }
    else if(a.length<3) {
        alert("Name cannot be less than 3 characters.");
    }
    else if(b.length!=10) {
        alert("Invalid Phone number.");
    }
    else if(!(c.match(emailval))) {
        alert("Invalid email address.")
    }

    else {

        var x = document.getElementById("disout");
        x.style.display="block";

        var rows = "";
        var name = document.getElementById("name").value;
        var mob = document.getElementById("mobnumber").value;
        var mail = document.getElementById("emailid").value;

        rows += `<td>` + name + `</td><td>` + mob + `</td><td>` + mail + `</td>`+`<td><button class="btn2" id =${idName} onclick="remove(${idName})">Delete</button></td>`;
        var tbody = document.querySelector("#list tbody");
        var tr = document.createElement("tr");

        tr.innerHTML = rows;
        tbody.appendChild(tr);
        idName++;
    }


}

function remove(idName) {
    var x = document.getElementById("list");
    x.deleteRow(idName);

}