function solution(array, commands) {
    var answer = [];

    for (let command of commands) {
        let i = command[0];
        let j = command[1];
        let k = command[2];
        
        let result = array.slice(i - 1, j);
        result.sort((a, b) => a - b);
        answer.push(result[k - 1]);
    }
    
    // 다른 풀이 1
    // for(let i = 0; i < commands.length; i++){
    //     let eachCommand = commands[i]
    //     let slice = array.slice(eachCommand[0] - 1, eachCommand[1])
    //           answer.push(slice.sort((a, b) => a - b)[eachCommand[2] - 1])
    // }

    // 다른 풀이2
    // for(let value of commands){
    //     answer.push(array.slice(value[0]-1, value[1]).sort((a,b)=>a-b)[value[2]-1]);
    // }
    
    // 다른 풀이3
    // answer = commands.map(a=>{
    //     return array.slice(a[0]-1,a[1]).sort((b,c)=>b-c)[a[2]-1];
    // })
    
    return answer;
}