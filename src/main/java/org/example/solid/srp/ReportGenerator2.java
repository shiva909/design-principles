package org.example.solid.srp;
class ReportRepository{
    public void get(int id){
        System.out.println("Fetched Report Data Succesfully"+id);
    }
}

class FormatService{
    public  void asPdf(String data){
        System.out.println("Formatted Data as PDF");
    }
}

class PrinterService{
    public void send(String file){
        System.out.println("Sent ReportData to Pdf");
    }
}


public class ReportGenerator2 {
    private final ReportRepository reportRepository;
    private final FormatService formatService;
    private final PrinterService printerService;
    ReportGenerator2(){
        reportRepository=new ReportRepository();
        formatService=new FormatService();
        printerService=new PrinterService();
    }
    public void generateReport(){
        reportRepository.get(1);
        formatService.asPdf("HelloWorld");
        printerService.send("file2");
    }
}
