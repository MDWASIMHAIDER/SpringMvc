/**
 * 
 */

function validate(frm){
	alert("validator()");
	let eno=frm.eno.value;
	let ename=frm.ename.value;
	let desg=frm.desg.value;
	let salary=frm.salary.value;
	let deptno=frm.deptno.value;
	let mgrno=frm.mgrno.value;
	
	if(ename==""){
		alert("ename called"+eno);
		document.getElementById("ename.err").innerHTML="name cant b empty";
		alert("after doc");
		frm.eno.focus();
		return false;
	}
	
}