new Chart(document.getElementById("myPieChart"),{
    type: 'pie',
    
    data: {
    // These labels appear in the legend and in the tooltips when hovering different arcs
    labels: ['January','February','March'],
    
    datasets: [{
	 labe: 'My Data Set',
	 backgroundColor:["#3e95cd","#8e5e","red"],
	 borderColor: 'rgb(255, 99, 132)',
     data: [10, 20, 30]
     }],
	//Configuration oprions go here
    options:{}
    }
});