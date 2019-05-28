// Calculate Total Retirement Earnings

function calculateRetirementEarnings(currentAmount, age, additionalAmountEachYear, rateOfReturn) {
    var total = currentAmount;
    var yearsToRetirement = 65 - age;
    while (yearsToRetirement > 0) {
        total = total + additionalAmountEachYear + 
                ((total + additionalAmountEachYear) * rateOfReturn);
        yearsToRetirement--;
    }
    return total;
}

//console.log(calculateRetirementEarnings(10, 18, 0, .05));
//console.log(calculateRetirementEarnings(500, 18, 0, .05));

console.log(calculateRetirementEarnings(301513, 30, 0, .07));
console.log(calculateRetirementEarnings(0, 35, 18000, .07));