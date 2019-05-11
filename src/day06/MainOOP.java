package day06;

import day04.Orang;

public class MainOOP {

	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 1;
		mhs.nama = "arif";
		mhs.alamat = "depok";
		mhs.jk = "Pria";
		mhs.noTelp = "0878xxxxxxxx";
		mhs.nim = "1231293782";
		mhs.jurusan = "komputer";
		mhs.fakultas = "fikti";
		mhs.angkatan = "2014";
		mhs.ipk = 4.2;
		mhs.cetakData();
		System.out.println();
		
		Dosen dsn = new Dosen();
		dsn.id = 2;
		dsn.nama = "bambang";
		dsn.alamat = "jakarta";
		dsn.jk = "pria";
		dsn.noTelp = "0977xxxxxxxxx";
		dsn.nik = "8k292929";
		dsn.spesialis = "sastra jawa";
		dsn.gaji = 89500000;
		dsn.jabatan = "dekan";
		dsn.fakultas = "ekonomi";
		dsn.cetakData();
		System.out.println();
		
		Staff stf = new Staff();
		stf.id = 3;
		stf.nama = "susi";
		stf.alamat = "bogor";
		stf.jk = "wanita";
		stf.noTelp = "0898xxxxxxxxxx";
		stf.nik = "j98u98979";
		stf.jabatan = "Supervisor";
		stf.gaji = 87800000;
		stf.departemen = "humas";
		Orang org01 = new Orang(4,"cipuy","cikarang","laki","0899xxxxxx");
		stf.atasan = new Orang(4,"cipuy","cikarang","laki","0899xxxxxx");
		stf.atasan = org01;
		stf.cetakData();
//		System.out.println(org01);

	}

}
