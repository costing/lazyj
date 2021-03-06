package lazyj.mail;

import java.util.HashMap;

/**
 * Mapping of content types based on the file extensions. 
 * 
 * @author costing
 * @since 2006-10-06
 */
@SuppressWarnings("nls")
public final class FileTypes {

	/**
	 * All file extensions
	 */
	private static final HashMap<String, String>	d = new HashMap<>(500, 0.95f); 

	static {
		// The contents below was obtained with this command:
		// cat /etc/mime.types | grep -v "^#" | grep / | while read type ext; do for e in $ext; do echo "d.put(\"$e\", \"$type\");" ; done; done | sort
		
		d.put("323", "text/h323");                                                                                                                                  
		d.put("3gp", "video/3gpp");                                                                                                                                 
		d.put("7z", "application/x-7z-compressed");                                                                                                                 
		d.put("abw", "application/x-abiword");                                                                                                                      
		d.put("ai", "application/postscript");                                                                                                                      
		d.put("aif", "audio/x-aiff");                                                                                                                               
		d.put("aifc", "audio/x-aiff");                                                                                                                              
		d.put("aiff", "audio/x-aiff");                                                                                                                              
		d.put("alc", "chemical/x-alchemy");                                                                                                                         
		d.put("amr", "audio/amr");                                                                                                                                  
		d.put("amr", "audio/amr");                                                                                                                                  
		d.put("anx", "application/annodex");                                                                                                                        
		d.put("apk", "application/vnd.android.package-archive");                                                                                                    
		d.put("~", "application/x-trash");                                                                                                                          
		d.put("%", "application/x-trash");                                                                                                                          
		d.put("art", "image/x-jg");                                                                                                                                 
		d.put("asc", "text/plain");                                                                                                                                 
		d.put("asf", "video/x-ms-asf");                                                                                                                             
		d.put("asn", "chemical/x-ncbi-asn1");                                                                                                                       
		d.put("asn", "chemical/x-ncbi-asn1-spec");                                                                                                                  
		d.put("aso", "chemical/x-ncbi-asn1-binary");                                                                                                                
		d.put("asx", "video/x-ms-asf");                                                                                                                             
		d.put("atom", "application/atom+xml");                                                                                                                      
		d.put("atomcat", "application/atomcat+xml");                                                                                                                
		d.put("atomsrv", "application/atomserv+xml");                                                                                                               
		d.put("au", "audio/basic");                                                                                                                                 
		d.put("avi", "video/x-msvideo");                                                                                                                            
		d.put("awb", "audio/amr-wb");                                                                                                                               
		d.put("awb", "audio/amr-wb");                                                                                                                               
		d.put("axa", "audio/annodex");                                                                                                                              
		d.put("axv", "video/annodex");                                                                                                                              
		d.put("bak", "application/x-trash");                                                                                                                        
		d.put("bat", "application/x-msdos-program");                                                                                                                
		d.put("b", "chemical/x-molconn-Z");                                                                                                                         
		d.put("bcpio", "application/x-bcpio");                                                                                                                      
		d.put("bib", "text/x-bibtex");                                                                                                                              
		d.put("bin", "application/octet-stream");                                                                                                                   
		d.put("bmp", "image/x-ms-bmp");                                                                                                                             
		d.put("book", "application/x-maker");                                                                                                                       
		d.put("boo", "text/x-boo");                                                                                                                                 
		d.put("brf", "text/plain");                                                                                                                                 
		d.put("bsd", "chemical/x-crossfire");                                                                                                                       
		d.put("c3d", "chemical/x-chem3d");                                                                                                                          
		d.put("cab", "application/x-cab");                                                                                                                          
		d.put("cac", "chemical/x-cache");                                                                                                                           
		d.put("cache", "chemical/x-cache");                                                                                                                         
		d.put("cap", "application/cap");                                                                                                                            
		d.put("cascii", "chemical/x-cactvs-binary");                                                                                                                
		d.put("cat", "application/vnd.ms-pki.seccat");                                                                                                              
		d.put("cbin", "chemical/x-cactvs-binary");                                                                                                                  
		d.put("cbr", "application/x-cbr");                                                                                                                          
		d.put("cbz", "application/x-cbz");                                                                                                                          
		d.put("cc", "text/x-c++src");                                                                                                                               
		d.put("cda", "application/x-cdf");                                                                                                                          
		d.put("cdf", "application/x-cdf");                                                                                                                          
		d.put("cdr", "image/x-coreldraw");                                                                                                                          
		d.put("cdt", "image/x-coreldrawtemplate");                                                                                                                  
		d.put("cdx", "chemical/x-cdx");                                                                                                                             
		d.put("cdy", "application/vnd.cinderella");                                                                                                                 
		d.put("cef", "chemical/x-cxf");                                                                                                                             
		d.put("cer", "chemical/x-cerius");                                                                                                                          
		d.put("chm", "chemical/x-chemdraw");                                                                                                                        
		d.put("chrt", "application/x-kchart");                                                                                                                      
		d.put("cif", "chemical/x-cif");                                                                                                                             
		d.put("class", "application/java-vm");                                                                                                                      
		d.put("cls", "text/x-tex");                                                                                                                                 
		d.put("cmdf", "chemical/x-cmdf");                                                                                                                           
		d.put("cml", "chemical/x-cml");                                                                                                                             
		d.put("cod", "application/vnd.rim.cod");                                                                                                                    
		d.put("com", "application/x-msdos-program");                                                                                                                
		d.put("cpa", "chemical/x-compass");                                                                                                                         
		d.put("cpio", "application/x-cpio");                                                                                                                        
		d.put("cpp", "text/x-c++src");                                                                                                                              
		d.put("cpt", "application/mac-compactpro");                                                                                                                 
		d.put("cpt", "image/x-corelphotopaint");                                                                                                                    
		d.put("cr2", "image/x-canon-cr2");                                                                                                                          
		d.put("crl", "application/x-pkcs7-crl");                                                                                                                    
		d.put("crt", "application/x-x509-ca-cert");                                                                                                                 
		d.put("crw", "image/x-canon-crw");                                                                                                                          
		d.put("csf", "chemical/x-cache-csf");                                                                                                                       
		d.put("csh", "application/x-csh");                                                                                                                          
		d.put("csh", "text/x-csh");                                                                                                                                 
		d.put("csm", "chemical/x-csml");                                                                                                                            
		d.put("csml", "chemical/x-csml");                                                                                                                           
		d.put("css", "text/css");                                                                                                                                   
		d.put("csv", "text/csv");                                                                                                                                   
		d.put("ctab", "chemical/x-cactvs-binary");                                                                                                                  
		d.put("c", "text/x-csrc");                                                                                                                                  
		d.put("c++", "text/x-c++src");                                                                                                                              
		d.put("ctx", "chemical/x-ctx");                                                                                                                             
		d.put("cu", "application/cu-seeme");                                                                                                                        
		d.put("cub", "chemical/x-gaussian-cube");                                                                                                                   
		d.put("cxf", "chemical/x-cxf");                                                                                                                             
		d.put("cxx", "text/x-c++src");                                                                                                                              
		d.put("dat", "application/x-ns-proxy-autoconfig");                                                                                                          
		d.put("davmount", "application/davmount+xml");                                                                                                              
		d.put("dcr", "application/x-director");                                                                                                                     
		d.put("deb", "application/x-debian-package");                                                                                                               
		d.put("diff", "text/x-diff");                                                                                                                               
		d.put("dif", "video/dv");                                                                                                                                   
		d.put("dir", "application/x-director");                                                                                                                     
		d.put("djv", "image/vnd.djvu");                                                                                                                             
		d.put("djvu", "image/vnd.djvu");                                                                                                                            
		d.put("dll", "application/x-msdos-program");                                                                                                                
		d.put("dl", "video/dl");                                                                                                                                    
		d.put("dmg", "application/x-apple-diskimage");                                                                                                              
		d.put("dms", "application/x-dms");                                                                                                                          
		d.put("doc", "application/msword");                                                                                                                         
		d.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");                                                                   
		d.put("dot", "application/msword");                                                                                                                         
		d.put("dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template");                                                                   
		d.put("d", "text/x-dsrc");                                                                                                                                  
		d.put("dvi", "application/x-dvi");                                                                                                                          
		d.put("dv", "video/dv");                                                                                                                                    
		d.put("dx", "chemical/x-jcamp-dx");                                                                                                                         
		d.put("dxr", "application/x-director");                                                                                                                     
		d.put("emb", "chemical/x-embl-dl-nucleotide");                                                                                                              
		d.put("embl", "chemical/x-embl-dl-nucleotide");                                                                                                             
		d.put("eml", "message/rfc822");                                                                                                                             
		d.put("ent", "chemical/x-ncbi-asn1-ascii");                                                                                                                 
		d.put("ent", "chemical/x-pdb");                                                                                                                             
		d.put("eps2", "application/postscript");                                                                                                                    
		d.put("eps3", "application/postscript");                                                                                                                    
		d.put("eps", "application/postscript");                                                                                                                     
		d.put("epsf", "application/postscript");                                                                                                                    
		d.put("epsi", "application/postscript");                                                                                                                    
		d.put("erf", "image/x-epson-erf");                                                                                                                          
		d.put("es", "application/ecmascript");                                                                                                                      
		d.put("etx", "text/x-setext");                                                                                                                              
		d.put("exe", "application/x-msdos-program");                                                                                                                
		d.put("ez", "application/andrew-inset");                                                                                                                    
		d.put("fb", "application/x-maker");                                                                                                                         
		d.put("fbdoc", "application/x-maker");                                                                                                                      
		d.put("fch", "chemical/x-gaussian-checkpoint");                                                                                                             
		d.put("fchk", "chemical/x-gaussian-checkpoint");                                                                                                            
		d.put("fig", "application/x-xfig");                                                                                                                         
		d.put("flac", "audio/flac");                                                                                                                                
		d.put("fli", "video/fli");                                                                                                                                  
		d.put("flv", "video/x-flv");                                                                                                                                
		d.put("fm", "application/x-maker");                                                                                                                         
		d.put("frame", "application/x-maker");                                                                                                                      
		d.put("frm", "application/x-maker");                                                                                                                        
		d.put("gal", "chemical/x-gaussian-log");                                                                                                                    
		d.put("gam", "chemical/x-gamess-input");                                                                                                                    
		d.put("gamin", "chemical/x-gamess-input");                                                                                                                  
		d.put("gau", "chemical/x-gaussian-input");                                                                                                                  
		d.put("gcd", "text/x-pcs-gcd");                                                                                                                             
		d.put("gcf", "application/x-graphing-calculator");                                                                                                          
		d.put("gcg", "chemical/x-gcg8-sequence");                                                                                                                   
		d.put("gen", "chemical/x-genbank");                                                                                                                         
		d.put("gf", "application/x-tex-gf");                                                                                                                        
		d.put("gif", "image/gif");                                                                                                                                  
		d.put("gjc", "chemical/x-gaussian-input");                                                                                                                  
		d.put("gjf", "chemical/x-gaussian-input");                                                                                                                  
		d.put("gl", "video/gl");                                                                                                                                    
		d.put("gnumeric", "application/x-gnumeric");                                                                                                                
		d.put("gpt", "chemical/x-mopac-graph");                                                                                                                     
		d.put("gsf", "application/x-font");                                                                                                                         
		d.put("gsm", "audio/x-gsm");                                                                                                                                
		d.put("gtar", "application/x-gtar");                                                                                                                        
		d.put("hdf", "application/x-hdf");                                                                                                                          
		d.put("hh", "text/x-c++hdr");                                                                                                                               
		d.put("hin", "chemical/x-hin");                                                                                                                             
		d.put("hpp", "text/x-c++hdr");                                                                                                                              
		d.put("hqx", "application/mac-binhex40");                                                                                                                   
		d.put("hs", "text/x-haskell");                                                                                                                              
		d.put("hta", "application/hta");                                                                                                                            
		d.put("htc", "text/x-component");                                                                                                                           
		d.put("h", "text/x-chdr");                                                                                                                                  
		d.put("h++", "text/x-c++hdr");                                                                                                                              
		d.put("html", "text/html");                                                                                                                                 
		d.put("htm", "text/html");                                                                                                                                  
		d.put("hxx", "text/x-c++hdr");                                                                                                                              
		d.put("ica", "application/x-ica");                                                                                                                          
		d.put("ice", "x-conference/x-cooltalk");                                                                                                                    
		d.put("ico", "image/x-icon");                                                                                                                               
		d.put("ics", "text/calendar");                                                                                                                              
		d.put("icz", "text/calendar");                                                                                                                              
		d.put("ief", "image/ief");                                                                                                                                  
		d.put("iges", "model/iges");                                                                                                                                
		d.put("igs", "model/iges");                                                                                                                                 
		d.put("iii", "application/x-iphone");                                                                                                                       
		d.put("info", "application/x-info");                                                                                                                        
		d.put("inp", "chemical/x-gamess-input");                                                                                                                    
		d.put("ins", "application/x-internet-signup");                                                                                                              
		d.put("iso", "application/x-iso9660-image");                                                                                                                
		d.put("isp", "application/x-internet-signup");                                                                                                              
		d.put("ist", "chemical/x-isostar");                                                                                                                         
		d.put("istr", "chemical/x-isostar");                                                                                                                        
		d.put("jad", "text/vnd.sun.j2me.app-descriptor");                                                                                                           
		d.put("jam", "application/x-jam");                                                                                                                          
		d.put("jar", "application/java-archive");                                                                                                                   
		d.put("java", "text/x-java");                                                                                                                               
		d.put("jdx", "chemical/x-jcamp-dx");                                                                                                                        
		d.put("jmz", "application/x-jmol");                                                                                                                         
		d.put("jng", "image/x-jng");                                                                                                                                
		d.put("jnlp", "application/x-java-jnlp-file");                                                                                                              
		d.put("jpeg", "image/jpeg");                                                                                                                                
		d.put("jpe", "image/jpeg");                                                                                                                                 
		d.put("jpg", "image/jpeg");                                                                                                                                 
		d.put("js", "application/javascript");                                                                                                                      
		d.put("kar", "audio/midi");                                                                                                                                 
		d.put("key", "application/pgp-keys");                                                                                                                       
		d.put("kil", "application/x-killustrator");                                                                                                                 
		d.put("kin", "chemical/x-kinemage");                                                                                                                        
		d.put("kml", "application/vnd.google-earth.kml+xml");                                                                                                       
		d.put("kmz", "application/vnd.google-earth.kmz");                                                                                                           
		d.put("kpr", "application/x-kpresenter");                                                                                                                   
		d.put("kpt", "application/x-kpresenter");                                                                                                                   
		d.put("ksp", "application/x-kspread");                                                                                                                      
		d.put("kwd", "application/x-kword");                                                                                                                        
		d.put("kwt", "application/x-kword");                                                                                                                        
		d.put("latex", "application/x-latex");                                                                                                                      
		d.put("lha", "application/x-lha");                                                                                                                          
		d.put("lhs", "text/x-literate-haskell");                                                                                                                    
		d.put("lin", "application/bbolin");                                                                                                                         
		d.put("lsf", "video/x-la-asf");                                                                                                                             
		d.put("lsx", "video/x-la-asf");                                                                                                                             
		d.put("ltx", "text/x-tex");                                                                                                                                 
		d.put("lyx", "application/x-lyx");                                                                                                                          
		d.put("lzh", "application/x-lzh");                                                                                                                          
		d.put("lzx", "application/x-lzx");                                                                                                                          
		d.put("m3g", "application/m3g");                                                                                                                            
		d.put("m3u", "audio/mpegurl");                                                                                                                              
		d.put("m3u", "audio/x-mpegurl");                                                                                                                            
		d.put("m4a", "audio/mpeg");                                                                                                                                 
		d.put("maker", "application/x-maker");                                                                                                                      
		d.put("man", "application/x-troff-man");                                                                                                                    
		d.put("mcif", "chemical/x-mmcif");                                                                                                                          
		d.put("mcm", "chemical/x-macmolecule");                                                                                                                     
		d.put("mdb", "application/msaccess");                                                                                                                       
		d.put("me", "application/x-troff-me");                                                                                                                      
		d.put("mesh", "model/mesh");                                                                                                                                
		d.put("mid", "audio/midi");                                                                                                                                 
		d.put("midi", "audio/midi");                                                                                                                                
		d.put("mif", "application/x-mif");                                                                                                                          
		d.put("mkv", "video/x-matroska");                                                                                                                           
		d.put("mm", "application/x-freemind");                                                                                                                      
		d.put("mmd", "chemical/x-macromodel-input");                                                                                                                
		d.put("mmf", "application/vnd.smaf");                                                                                                                       
		d.put("mml", "text/mathml");                                                                                                                                
		d.put("mmod", "chemical/x-macromodel-input");                                                                                                               
		d.put("mng", "video/x-mng");                                                                                                                                
		d.put("moc", "text/x-moc");                                                                                                                                 
		d.put("mol2", "chemical/x-mol2");                                                                                                                           
		d.put("mol", "chemical/x-mdl-molfile");                                                                                                                     
		d.put("moo", "chemical/x-mopac-out");                                                                                                                       
		d.put("mop", "chemical/x-mopac-input");                                                                                                                     
		d.put("mopcrt", "chemical/x-mopac-input");                                                                                                                  
		d.put("movie", "video/x-sgi-movie");                                                                                                                        
		d.put("mov", "video/quicktime");                                                                                                                            
		d.put("mp2", "audio/mpeg");                                                                                                                                 
		d.put("mp3", "audio/mpeg");                                                                                                                                 
		d.put("mp4", "video/mp4");                                                                                                                                  
		d.put("mpc", "chemical/x-mopac-input");                                                                                                                     
		d.put("mpega", "audio/mpeg");                                                                                                                               
		d.put("mpeg", "video/mpeg");                                                                                                                                
		d.put("mpe", "video/mpeg");                                                                                                                                 
		d.put("mpga", "audio/mpeg");                                                                                                                                
		d.put("mpg", "video/mpeg");                                                                                                                                 
		d.put("mpv", "video/x-matroska");                                                                                                                           
		d.put("ms", "application/x-troff-ms");                                                                                                                      
		d.put("msh", "model/mesh");                                                                                                                                 
		d.put("msi", "application/x-msi");                                                                                                                          
		d.put("mvb", "chemical/x-mopac-vib");                                                                                                                       
		d.put("mxu", "video/vnd.mpegurl");                                                                                                                          
		d.put("nb", "application/mathematica");                                                                                                                     
		d.put("nbp", "application/mathematica");                                                                                                                    
		d.put("nc", "application/x-netcdf");                                                                                                                        
		d.put("nef", "image/x-nikon-nef");                                                                                                                          
		d.put("nwc", "application/x-nwc");                                                                                                                          
		d.put("o", "application/x-object");                                                                                                                         
		d.put("oda", "application/oda");                                                                                                                            
		d.put("odb", "application/vnd.oasis.opendocument.database");                                                                                                
		d.put("odc", "application/vnd.oasis.opendocument.chart");                                                                                                   
		d.put("odf", "application/vnd.oasis.opendocument.formula");                                                                                                 
		d.put("odg", "application/vnd.oasis.opendocument.graphics");                                                                                                
		d.put("odi", "application/vnd.oasis.opendocument.image");                                                                                                   
		d.put("odm", "application/vnd.oasis.opendocument.text-master");                                                                                             
		d.put("odp", "application/vnd.oasis.opendocument.presentation");                                                                                            
		d.put("ods", "application/vnd.oasis.opendocument.spreadsheet");                                                                                             
		d.put("odt", "application/vnd.oasis.opendocument.text");                                                                                                    
		d.put("oga", "audio/ogg");                                                                                                                                  
		d.put("ogg", "audio/ogg");                                                                                                                                  
		d.put("ogv", "video/ogg");                                                                                                                                  
		d.put("ogx", "application/ogg");                                                                                                                            
		d.put("old", "application/x-trash");                                                                                                                        
		d.put("orf", "image/x-olympus-orf");                                                                                                                        
		d.put("otg", "application/vnd.oasis.opendocument.graphics-template");                                                                                       
		d.put("oth", "application/vnd.oasis.opendocument.text-web");                                                                                                
		d.put("otp", "application/vnd.oasis.opendocument.presentation-template");                                                                                   
		d.put("ots", "application/vnd.oasis.opendocument.spreadsheet-template");                                                                                    
		d.put("ott", "application/vnd.oasis.opendocument.text-template");                                                                                           
		d.put("oza", "application/x-oz-application");                                                                                                               
		d.put("p7r", "application/x-pkcs7-certreqresp");                                                                                                            
		d.put("pac", "application/x-ns-proxy-autoconfig");                                                                                                          
		d.put("pas", "text/x-pascal");                                                                                                                              
		d.put("patch", "text/x-diff");                                                                                                                              
		d.put("pat", "image/x-coreldrawpattern");                                                                                                                   
		d.put("pbm", "image/x-portable-bitmap");                                                                                                                    
		d.put("pcap", "application/cap");                                                                                                                           
		d.put("pcf", "application/x-font");                                                                                                                         
		d.put("pcf.Z", "application/x-font");                                                                                                                       
		d.put("pcx", "image/pcx");                                                                                                                                  
		d.put("pdb", "chemical/x-pdb");                                                                                                                             
		d.put("pdf", "application/pdf");                                                                                                                            
		d.put("pfa", "application/x-font");                                                                                                                         
		d.put("pfb", "application/x-font");                                                                                                                         
		d.put("pgm", "image/x-portable-graymap");                                                                                                                   
		d.put("pgn", "application/x-chess-pgn");                                                                                                                    
		d.put("pgp", "application/pgp-signature");                                                                                                                  
		d.put("php3", "application/x-httpd-php3");                                                                                                                  
		d.put("php3p", "application/x-httpd-php3-preprocessed");                                                                                                    
		d.put("php4", "application/x-httpd-php4");                                                                                                                  
		d.put("php", "application/x-httpd-php");                                                                                                                    
		d.put("phps", "application/x-httpd-php-source");                                                                                                            
		d.put("pht", "application/x-httpd-php");                                                                                                                    
		d.put("phtml", "application/x-httpd-php");                                                                                                                  
		d.put("pk", "application/x-tex-pk");                                                                                                                        
		d.put("pls", "audio/x-scpls");                                                                                                                              
		d.put("pl", "text/x-perl");                                                                                                                                 
		d.put("pm", "text/x-perl");                                                                                                                                 
		d.put("png", "image/png");                                                                                                                                  
		d.put("pnm", "image/x-portable-anymap");                                                                                                                    
		d.put("pot", "text/plain");                                                                                                                                 
		d.put("potx", "application/vnd.openxmlformats-officedocument.presentationml.template");                                                                     
		d.put("ppm", "image/x-portable-pixmap");                                                                                                                    
		d.put("pps", "application/vnd.ms-powerpoint");                                                                                                              
		d.put("ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");                                                                    
		d.put("ppt", "application/vnd.ms-powerpoint");                                                                                                              
		d.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");                                                                 
		d.put("prf", "application/pics-rules");                                                                                                                     
		d.put("prt", "chemical/x-ncbi-asn1-ascii");                                                                                                                 
		d.put("ps", "application/postscript");                                                                                                                      
		d.put("psd", "image/x-photoshop");                                                                                                                          
		d.put("p", "text/x-pascal");                                                                                                                                
		d.put("pyc", "application/x-python-code");                                                                                                                  
		d.put("pyo", "application/x-python-code");                                                                                                                  
		d.put("py", "text/x-python");                                                                                                                               
		d.put("qgs", "application/x-qgis");                                                                                                                         
		d.put("qtl", "application/x-quicktimeplayer");                                                                                                              
		d.put("qt", "video/quicktime");                                                                                                                             
		d.put("ra", "audio/x-pn-realaudio");                                                                                                                        
		d.put("ra", "audio/x-realaudio");                                                                                                                           
		d.put("ram", "audio/x-pn-realaudio");                                                                                                                       
		d.put("rar", "application/rar");                                                                                                                            
		d.put("ras", "image/x-cmu-raster");                                                                                                                         
		d.put("rb", "application/x-ruby");                                                                                                                          
		d.put("rd", "chemical/x-mdl-rdfile");                                                                                                                       
		d.put("rdf", "application/rdf+xml");                                                                                                                        
		d.put("rgb", "image/x-rgb");                                                                                                                                
		d.put("rhtml", "application/x-httpd-eruby");                                                                                                                
		d.put("rm", "audio/x-pn-realaudio");                                                                                                                        
		d.put("roff", "application/x-troff");                                                                                                                       
		d.put("ros", "chemical/x-rosdal");                                                                                                                          
		d.put("rpm", "application/x-redhat-package-manager");                                                                                                       
		d.put("rss", "application/rss+xml");                                                                                                                        
		d.put("rtf", "application/rtf");                                                                                                                            
		d.put("rtx", "text/richtext");                                                                                                                              
		d.put("rxn", "chemical/x-mdl-rxnfile");                                                                                                                     
		d.put("scala", "text/x-scala");                                                                                                                             
		d.put("scr", "application/x-silverlight");                                                                                                                  
		d.put("sct", "text/scriptlet");                                                                                                                             
		d.put("sd2", "audio/x-sd2");                                                                                                                                
		d.put("sda", "application/vnd.stardivision.draw");                                                                                                          
		d.put("sdc", "application/vnd.stardivision.calc");                                                                                                          
		d.put("sd", "chemical/x-mdl-sdfile");                                                                                                                       
		d.put("sdd", "application/vnd.stardivision.impress");                                                                                                       
		d.put("sdf", "application/vnd.stardivision.math");                                                                                                          
		d.put("sdf", "chemical/x-mdl-sdfile");                                                                                                                      
		d.put("sds", "application/vnd.stardivision.chart");                                                                                                         
		d.put("sdw", "application/vnd.stardivision.writer");                                                                                                        
		d.put("ser", "application/java-serialized-object");                                                                                                         
		d.put("sgf", "application/x-go-sgf");                                                                                                                       
		d.put("sgl", "application/vnd.stardivision.writer-global");                                                                                                 
//		d.put("sh", "application/x-sh");                                                                                                                            
		d.put("shar", "application/x-shar");                                                                                                                        
		d.put("shp", "application/x-qgis");                                                                                                                         
		d.put("sh", "text/x-sh");                                                                                                                                   
		d.put("shtml", "text/html");                                                                                                                                
		d.put("shx", "application/x-qgis");                                                                                                                         
		d.put("sid", "audio/prs.sid");                                                                                                                              
		d.put("sik", "application/x-trash");                                                                                                                        
		d.put("silo", "model/mesh");                                                                                                                                
		d.put("sis", "application/vnd.symbian.install");                                                                                                            
		d.put("sisx", "x-epoc/x-sisx-app");                                                                                                                         
		d.put("sit", "application/x-stuffit");                                                                                                                      
		d.put("sitx", "application/x-stuffit");                                                                                                                     
		d.put("skd", "application/x-koan");                                                                                                                         
		d.put("skm", "application/x-koan");                                                                                                                         
		d.put("skp", "application/x-koan");                                                                                                                         
		d.put("skt", "application/x-koan");                                                                                                                         
		d.put("smi", "application/smil");                                                                                                                           
		d.put("smil", "application/smil");                                                                                                                          
		d.put("snd", "audio/basic");                                                                                                                                
		d.put("spc", "chemical/x-galactic-spc");                                                                                                                    
		d.put("spl", "application/futuresplash");                                                                                                                   
		d.put("spl", "application/x-futuresplash");                                                                                                                 
		d.put("spx", "audio/ogg");                                                                                                                                  
		d.put("src", "application/x-wais-source");                                                                                                                  
		d.put("stc", "application/vnd.sun.xml.calc.template");                                                                                                      
		d.put("std", "application/vnd.sun.xml.draw.template");                                                                                                      
		d.put("sti", "application/vnd.sun.xml.impress.template");                                                                                                   
		d.put("stl", "application/vnd.ms-pki.stl");                                                                                                                 
		d.put("stw", "application/vnd.sun.xml.writer.template");                                                                                                    
		d.put("sty", "text/x-tex");                                                                                                                                 
		d.put("sv4cpio", "application/x-sv4cpio");                                                                                                                  
		d.put("sv4crc", "application/x-sv4crc");                                                                                                                    
		d.put("svg", "image/svg+xml");                                                                                                                              
		d.put("svgz", "image/svg+xml");                                                                                                                             
		d.put("sw", "chemical/x-swissprot");                                                                                                                        
		d.put("swf", "application/x-shockwave-flash");                                                                                                              
		d.put("swfl", "application/x-shockwave-flash");                                                                                                             
		d.put("sxc", "application/vnd.sun.xml.calc");                                                                                                               
		d.put("sxd", "application/vnd.sun.xml.draw");                                                                                                               
		d.put("sxg", "application/vnd.sun.xml.writer.global");                                                                                                      
		d.put("sxi", "application/vnd.sun.xml.impress");                                                                                                            
		d.put("sxm", "application/vnd.sun.xml.math");                                                                                                               
		d.put("sxw", "application/vnd.sun.xml.writer");                                                                                                             
		d.put("t", "application/x-troff");                                                                                                                          
		d.put("tar", "application/x-tar");                                                                                                                          
		d.put("taz", "application/x-gtar");                                                                                                                         
		d.put("tcl", "application/x-tcl");                                                                                                                          
		d.put("tcl", "text/x-tcl");                                                                                                                                 
		d.put("texi", "application/x-texinfo");                                                                                                                     
		d.put("texinfo", "application/x-texinfo");                                                                                                                  
		d.put("tex", "text/x-tex");                                                                                                                                 
		d.put("text", "text/plain");                                                                                                                                
		d.put("tgf", "chemical/x-mdl-tgf");                                                                                                                         
		d.put("tgz", "application/x-gtar");                                                                                                                         
		d.put("tiff", "image/tiff");                                                                                                                                
		d.put("tif", "image/tiff");                                                                                                                                 
		d.put("tk", "text/x-tcl");                                                                                                                                  
		d.put("tm", "text/texmacs");                                                                                                                                
		d.put("torrent", "application/x-bittorrent");                                                                                                               
		d.put("tr", "application/x-troff");                                                                                                                         
		d.put("tsp", "application/dsptype");                                                                                                                        
		d.put("ts", "text/texmacs");                                                                                                                                
		d.put("tsv", "text/tab-separated-values");                                                                                                                  
		d.put("txt", "text/plain");                                                                                                                                 
		d.put("udeb", "application/x-debian-package");                                                                                                              
		d.put("uls", "text/iuls");                                                                                                                                  
		d.put("ustar", "application/x-ustar");                                                                                                                      
		d.put("val", "chemical/x-ncbi-asn1-binary");                                                                                                                
		d.put("vcd", "application/x-cdlink");                                                                                                                       
		d.put("vcf", "text/x-vcard");                                                                                                                               
		d.put("vcs", "text/x-vcalendar");                                                                                                                           
		d.put("vmd", "chemical/x-vmd");                                                                                                                             
		d.put("vms", "chemical/x-vamas-iso14976");                                                                                                                  
		d.put("vrml", "model/vrml");
		d.put("vrml", "x-world/x-vrml");
		d.put("vrm", "x-world/x-vrml");
		d.put("vsd", "application/vnd.visio");
		d.put("wad", "application/x-doom");
		d.put("wav", "audio/x-wav");
		d.put("wax", "audio/x-ms-wax");
		d.put("wbmp", "image/vnd.wap.wbmp");
		d.put("wbxml", "application/vnd.wap.wbxml");
		d.put("wk", "application/x-123");
		d.put("wma", "audio/x-ms-wma");
		d.put("wmd", "application/x-ms-wmd");
		d.put("wmlc", "application/vnd.wap.wmlc");
		d.put("wmlsc", "application/vnd.wap.wmlscriptc");
		d.put("wmls", "text/vnd.wap.wmlscript");
		d.put("wml", "text/vnd.wap.wml");
		d.put("wm", "video/x-ms-wm");
		d.put("wmv", "video/x-ms-wmv");
		d.put("wmx", "video/x-ms-wmx");
		d.put("wmz", "application/x-ms-wmz");
		d.put("wp5", "application/vnd.wordperfect5.1");
		d.put("wpd", "application/vnd.wordperfect");
		d.put("wrl", "model/vrml");
		d.put("wrl", "x-world/x-vrml");
		d.put("wsc", "text/scriptlet");
		d.put("wvx", "video/x-ms-wvx");
		d.put("wz", "application/x-wingz");
		d.put("x3db", "model/x3d+binary");
		d.put("x3d", "model/x3d+xml");
		d.put("x3dv", "model/x3d+vrml");
		d.put("xbm", "image/x-xbitmap");
		d.put("xcf", "application/x-xcf");
		d.put("xht", "application/xhtml+xml");
		d.put("xhtml", "application/xhtml+xml");
		d.put("xlb", "application/vnd.ms-excel");
		d.put("xls", "application/vnd.ms-excel");
		d.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		d.put("xlt", "application/vnd.ms-excel");
		d.put("xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template");
		d.put("xml", "application/xml");
		d.put("xpi", "application/x-xpinstall");
		d.put("xpm", "image/x-xpixmap");
		d.put("xsd", "application/xml");
		d.put("xsl", "application/xml");
		d.put("xspf", "application/xspf+xml");
		d.put("xtel", "chemical/x-xtel");
		d.put("xul", "application/vnd.mozilla.xul+xml");
		d.put("xwd", "image/x-xwindowdump");
		d.put("xyz", "chemical/x-xyz");
		d.put("zip", "application/zip");
		d.put("zmt", "chemical/x-mopac-input");
		
		// and some extras for ALICE
		d.put("root", "application/root");
		d.put("jdl" , "text/x-jdl");
		d.put("rc"  , "text/x-sh");
		d.put("res" , "text/html");
	}

	/**
	 * Given a full file name, this method returns the MIME content type based on the file extension.
	 * In case that the file doesn't have an extension or it is not in the defined table, it will return
	 * the default "application/octet-stream".
	 * 
	 * @param sFileName the complete file name
	 * @return the content type to be used with this file
	 */
	public static String getMIMETypeOf(final String sFileName) {
		final int idx = sFileName.lastIndexOf('.');
		
		if (idx>=0){
			final String s = sFileName.substring(idx + 1);
			
			final String r = getMIMETypeOfExtension(s);
				
			if (r!=null)
				return r;
		}
		
		return "application/octet-stream";
	}
	
	/**
	 * Get the MIME type of the given extension
	 * 
	 * @param fileNameExtension
	 * @return the MIME type, if known of <code>null</code> if not
	 */
	public static String getMIMETypeOfExtension(final String fileNameExtension){
		return d.get(fileNameExtension.toLowerCase());
	}
	
	/**
	 * Register a new file extension
	 * 
	 * @param sExt file extension
	 * @param sType MIME type for this file
	 * @return old type, if it was defined
	 */
	public static String registerExtension(final String sExt, final String sType){
		return d.put(sExt, sType);
	}
}
