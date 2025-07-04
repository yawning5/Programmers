function solution(ingredient) {
    var answer = 0;
    const stack = [];
    
    for (const s of ingredient) {
        stack.push(s);
        if (stack.length >= 4 
            && stack[stack.length - 4] === 1
            && stack[stack.length - 3] === 2
           && stack[stack.length - 2] === 3
           && stack[stack.length - 1] === 1
        ){
        
            let i = 0
            while (i < 4) {
                stack.pop();
                i++
            }
            answer++;
        }
    }
    
    return answer;
}