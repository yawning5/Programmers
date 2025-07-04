function solution(brown, yellow) {
    var answer = [];
    const width = brown + yellow;
    let s = 0;
    
    for (let i = 0; i < width; i++) {
        if (width % i === 0) {
            s = width / i;
            if (i <= s && (s - 2) * (i - 2) === yellow) {
                answer[0] = s;
                answer[1] = i;
                break;
            }
        }
    }
    
    return answer;
}