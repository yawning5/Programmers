function solution(want, number, discount) {
    var answer = 0;
    const memo = []
    for (let i = 0; i < want.length; i++) {
        memo.push([want[i], number[i]])
    }
    
    for (let i = 0; i + 10 <= discount.length; i++) {
        const cart = new Map(memo);
        for (let j = i; j < i + 10; j++) {
            if (cart.has(discount[j])) {
                cart.set(discount[j], cart.get(discount[j]) - 1)
            }
        }
        if ([...cart.values()].filter(m => m > 0).length === 0) {
            answer++;
        }
    }
    
    return answer;
}