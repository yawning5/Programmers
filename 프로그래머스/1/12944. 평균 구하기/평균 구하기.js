function solution(arr) {
    var answer = 0;
    for (const n of arr) {
        answer += n;
    }
    return answer / arr.length;
}