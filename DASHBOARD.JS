const sponsors = {"HealthPlus Foundation":{
    password:"health012", items: ["Vitamins and Supplements", "Community Meals", "Child Nutrition Kits"]
},
"Grow Afrika":{
    password: "grow234", items:["Coding Bootcamp", "Speech therapy", "Youth Training"]
},
"MedAid Corp":{
    password: "medaid567", items:["Food Hampers", "Mobile Kitchen", "Nutrition Class"]
},
"Imama Trust":{
    password: "imama891", items:["Health Workshops", "School Supplies"]
}
};

document.getElementById("loginForm").addEventListener("submit", function(e){
e.preventDefault();
const name= document.getElementById("sponsor-name").value.trim();
const pass = document.getElementById("passwod").value;

if(sponsors[name] && sponsors[name].password === pass){
    document.getElementById("dashboard").style.display = "block";

    document.getElementById("loginForm").style.display = "none";

    document.getElementById("errorMessage").style.display = "none";

    document.getElementById("sponsorName").textContent= "name";

    const list= document.getElementById("sponsoredList");
    list.innerHTML= "";
    sponsors[name].items.forEach(item=>{
        const li = document.createElement("li");
        li.textContent = item;
        list,appendChild(li);
    });
} else {
    document.getElementById("errorMessage").style.display = "block"
}
});