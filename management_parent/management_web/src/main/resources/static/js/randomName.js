let names = [
	"李源志", "刘恒", "崔恒嘉", "王振华", "张辉",
	"张宇佳", "刘昌燊", "王傲旗", "章丽", "张俊奇",
	"彭安", "郭祥", "张智超", "冯源", "李宜波",
	"刘伟祺", "刘泽林", "李佳琪", "范博元", "马浩钦", 
	"马璐", "李姣姣", "胡熙梅", "王佳琦", "曹乐阳", 
	"邓爱", "雷春光", "杜有灏", "杨贵东", "巩力",
	"信志", "牛瑨", "黄志益", "陈颖钥", "李源志",
	"张濛", "刘程龙", "王璐凯", "任鑫磊", "向全宇", 
	"南一凡", "李涛", "黄东虎", "熊颖悟", "潘书鹏",
	"李思缘", "郭昕玮", "杨涵", "周文均", "丁炳胜",
	"田朝阳", "李帅", "张成彪", "李志康", "胡慧同", 
	"周梓贤", "张鑫", "杨昌赫", "符志宁", "余天洪", 
	"曾志辉", "张小奇"
];


let time;
function begin() {
	document.getElementById("beginBtn").disabled = true;
	time = window.setInterval(beginRandom, 1);
}

function beginRandom() {
	var index = Math.floor(Math.random() * names.length);
	document.getElementById("name").innerHTML = "<font>" + names[index] +"</font>";
}

function over() {
	document.getElementById("beginBtn").disabled = false;
	clearInterval(time);
}
