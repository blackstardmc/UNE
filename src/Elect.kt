fun calc(amount: Double): Double {
    var total = 0.0
    var c = amount

    while (c > 0) {
        if (c in 0..100) {
            total += c * 0.33
            break
        } else if (c in 101..150) {
            total += ((c - 100) * 1.07)
            c -= (c - 100)
        } else if (c in 151..200) {
            total += ((c - 150) * 1.43)
            c -= (c - 150)
        } else if (c in 201..250) {
            total += ((c - 200) * 2.46)
            c -= (c - 200)
        } else if (c in 251..300) {
            total += ((c - 250) * 3.0)
            c -= (c - 250)
        } else if (c in 301..350) {
            total += ((c - 300) * 4.0)
            c -= (c - 300)
        } else if (c in 351..400) {
            total += ((c - 350) * 5.0)
            c -= (c - 350)
        } else if (c in 401..450) {
            total += ((c - 400) * 6.0)
            c -= (c - 400)
        } else if (c in 451..500) {
            total += ((c - 450) * 7.0)
            c -= (c - 450)
        } else if (c in 501..600) {
            total += ((c - 500) * 9.2)
            c -= (c - 500)
        } else if (c in 601..700) {
            total += ((c - 600) * 9.45)
            c -= (c - 600)
        } else if (c in 701..1000) {
            total += ((c - 700) * 9.85)
            c -= (c - 700)
        } else if (c in 1001..1800) {
            total += ((c - 1000) * 10.8)
            c -= (c - 1000)
        } else if (c in 1801..2600) {
            total += ((c - 1800) * 11.8)
            c -= (c - 1800)
        } else if (c in 2601..3400) {
            total += ((c - 2600) * 12.9)
            c -= (c - 2600)
        } else if (c in 3401..4200) {
            total += ((c - 3400) * 13.95)
            c -= (c - 3400)
        } else if (c in 4201..5000) {
            total += ((c - 4200) * 15.0)
            c -= (c - 4200)
        } else if (c > 5000) {
            total += ((c - 5000) * 20.0)
            c -= (c - 5000)
        }

    }
    return total
}



