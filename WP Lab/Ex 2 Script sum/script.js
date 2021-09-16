var array
array = Array();
x=0;
sum=0;

function addele()
{
    array[x] = document.getElementById("text1").value;
    sum+=parseInt(array[x]);
    x++;
    alert("element" + array[x-1] + "added");
    document.getElementById("text1").value = "";
    console.log(sum);
}

function suma()
{
    e="<h2>"+sum+"</h2>"
    document.getElementById("result").innerHTML = e;
    console.log(sum);
}