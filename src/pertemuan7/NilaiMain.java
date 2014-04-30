package pertemuan7;

import java.util.ArrayList;
import java.util.List;



public class NilaiMain {
	
	private List<Nilai> listNilai;
	private List<Mahasiswa> listMhs;
	private List<Matakuliah> listMk;
	
	public NilaiMain(){
		this.listNilai=new ArrayList<Nilai>();
		this.listMhs=new ArrayList<Mahasiswa>();
		this.listMk=new ArrayList<Matakuliah>();
	}
	
	public void initMhs(){
		listMhs.add(new Mahasiswa("113040100","Asep","Pekanbaru"));
		listMhs.add(new Mahasiswa("113040101","Budi","Solo"));
	}
	
	public void initMatkul(){
		listMk.add(new Matakuliah("IF123","RKPPL",3));
		listMk.add(new Matakuliah("IF666","PSBK",3));
	}
	
	public void initNilai(){
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 4.0));
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(1), 2.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(0), 3.0));
	}
	
	public void tampilMhs(){
		for(Mahasiswa mhs:listMhs){
			System.out.println(mhs);
		}
	}
	
	public void tampilMatkul(){
		for(Matakuliah mk:listMk){
			System.out.println(mk);
		}
	}
	
	public void tampilNilai(){
		for(Nilai nilai:listNilai){
			System.out.println(nilai);
		}
	}
	
	public static void main(String[] args) {
		NilaiMain nm = new NilaiMain();
		nm.initMhs();
		nm.initMatkul();
		nm.initNilai();
		System.out.println("LISIT MAHASISWA");
		nm.tampilMhs();
		System.out.println("LISIT MATAKULIAH");
		nm.tampilMatkul();
		System.out.println("LISIT NILAI");
		nm.tampilNilai();
	}

}
