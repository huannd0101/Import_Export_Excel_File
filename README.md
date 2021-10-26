# Demo import and export file excel with POI



### Thêm dependences 

- excel 2003

<pre>&lt;<span class="pl-ent">dependency</span>&gt;
  &lt;<span class="pl-ent">groupId</span>&gt;org.apache.poi&lt;/<span class="pl-ent">groupId</span>&gt;
  &lt;<span class="pl-ent">artifactId</span>&gt;poi&lt;/<span class="pl-ent">artifactId</span>&gt;
  &lt;<span class="pl-ent">version</span>&gt;3.17&lt;/<span class="pl-ent">version</span>&gt;
&lt;/<span class="pl-ent">dependency</span>&gt;
</pre>

- excel 2007 trở lên

<pre>&lt;<span class="pl-ent">dependency</span>&gt;
  &lt;<span class="pl-ent">groupId</span>&gt;org.apache.poi&lt;/<span class="pl-ent">groupId</span>&gt;
  &lt;<span class="pl-ent">artifactId</span>&gt;poi-ooxml&lt;/<span class="pl-ent">artifactId</span>&gt;
  &lt;<span class="pl-ent">version</span>&gt;3.17&lt;/<span class="pl-ent">version</span>&gt;
&lt;/<span class="pl-ent">dependency</span>&gt;
</pre>


### Các class cơ bản được dùng để đọc ghi file Excel

- HSSF: các class có tên bắt đầu là HSSF được dùng để sử lý các file Microsoft Excel 2003 (.xls)
- XSSF: các class có tên bắt đầu là XSSF được dùng để sử lý các file Microsoft Excel 2007 trở về sau (.xlsx)
- XSSFWorkbook và HSSFWorkbook là các class xử lý với Excel Workbook
- HSSFSheet và XSSFSheet là các class xử lý với Excel Worksheet
- Row: định nghĩa một dòng trong excel
- Cell: định nghĩa một ô trong excel

### 
