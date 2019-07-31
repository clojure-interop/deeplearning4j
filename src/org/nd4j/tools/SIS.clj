(ns org.nd4j.tools.SIS
  "Show informations in console.
 if required save informations in file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tools SIS]))

(defn ->sis
  "Constructor."
  (^SIS []
    (new SIS )))

(defn init-values
  "initValues
  public void initValues( int mtLv, String superiorModuleCode,
  PrintStream out, PrintStream err, String fileDrcS,
  String base_FileCode, String spc_FileCode,
  boolean ShowBriefInfo, boolean ShowFullInfo )
  Initialize values for console and file.
  fullFileName =
  \"Z\"
  TimeS  \"_\"
  base_FileCode  \"_\"
  spc_FileCode
  \".txt\";
  TimeS (time string) format: \"yyyyMMdd'_'HHmmss.SSS\"

  mt-lv - - method level - `int`
  superior-module-code - - superior module code - `java.lang.String`
  out - - console standard output - `java.io.PrintStream`
  err - - console error output (not used) - `java.io.PrintStream`
  file-drc-s - - file directory as string - `java.lang.String`
  base-file-code - - base part of file code - `java.lang.String`
  spc-file-code - - specifying part of file code - `java.lang.String`
  show-brief-info - - show brief informations - `boolean`
  show-full-info - - show full informations - `boolean`"
  ([^SIS this ^Integer mt-lv ^java.lang.String superior-module-code ^java.io.PrintStream out ^java.io.PrintStream err ^java.lang.String file-drc-s ^java.lang.String base-file-code ^java.lang.String spc-file-code ^Boolean show-brief-info ^Boolean show-full-info]
    (-> this (.initValues mt-lv superior-module-code out err file-drc-s base-file-code spc-file-code show-brief-info show-full-info)))
  ([^SIS this ^Integer mt-lv ^java.lang.String superior-module-code ^java.io.PrintStream out ^java.io.PrintStream err]
    (-> this (.initValues mt-lv superior-module-code out err))))

(defn getfull-file-name
  "getfullFileName
  public String getfullFileName()
  Returns full file name

  returns: full file name - `java.lang.String`"
  (^java.lang.String [^SIS this]
    (-> this (.getfullFileName))))

(defn info
  "info
  public void info( String oinfo )
  This method is input for informations.
  Informations are showed in console and saved in file.

  oinfo - - information - `java.lang.String`"
  ([^SIS this ^java.lang.String oinfo]
    (-> this (.info oinfo))))

(defn getchars-count
  "getcharsCount
  public long getcharsCount()
  Returns chars count counted from SIS creating.

  returns: chars count - `long`"
  (^Long [^SIS this]
    (-> this (.getcharsCount))))

(defn on-stop
  "onStop
  public void onStop( int mtLv )
  This method should be called at the end of program.
  Close file.

  mt-lv - - method level - `int`"
  ([^SIS this ^Integer mt-lv]
    (-> this (.onStop mt-lv))))

