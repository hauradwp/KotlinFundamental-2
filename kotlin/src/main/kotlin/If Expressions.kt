fun main() {
    val NilaiDiatasKkm = 90
    val NilaiDibawahKKm = 70
    val nilai: String
    nilai = if (NilaiDibawahKKm > 75) {
        "Selamat ya!!! "
    } else if (NilaiDibawahKKm > NilaiDiatasKkm) {
        "Niai kamu 85, selamay ya!!! "
    } else {
        "Nilai kamu 70, silahlan ikuti remidial"
    }
    print(nilai)
}