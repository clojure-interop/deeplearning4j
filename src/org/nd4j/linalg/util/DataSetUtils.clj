(ns org.nd4j.linalg.util.DataSetUtils
  "shows content of some classes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util DataSetUtils]))

(defn ->data-set-utils
  "Constructor.

  sis - `org.nd4j.tools.SIS`
  superior-module-code - `java.lang.String`"
  (^DataSetUtils [^org.nd4j.tools.SIS sis ^java.lang.String superior-module-code]
    (new DataSetUtils sis superior-module-code)))

(defn show-data-set
  "showDataSet
  public void showDataSet( int mtLv, String itemCode, DataSet ds,
  int in_Digits, int ot_Digits, int r_End_I, int c_End_I )
  Shows content of DataSet.

  mt-lv - - method level - `int`
  item-code - - item = DataSet - `java.lang.String`
  ds - - DataSet - `org.nd4j.linalg.dataset.DataSet`
  in-digits - - input digits - `int`
  ot-digits - - output digits - `int`
  r-end-i - - rows end index - `int`
  c-end-i - - columns end index - `int`"
  ([^DataSetUtils this ^Integer mt-lv ^java.lang.String item-code ^org.nd4j.linalg.dataset.DataSet ds ^Integer in-digits ^Integer ot-digits ^Integer r-end-i ^Integer c-end-i]
    (-> this (.showDataSet mt-lv item-code ds in-digits ot-digits r-end-i c-end-i))))

(defn show-ind-array
  "showINDArray
  public void showINDArray( int mtLv, String itemCode, INDArray INDA,
  int digits, int r_End_I, int c_End_I, boolean turned )
  Shows content of INDArray.
  If turned is false shows first rows and than columns.
  If turned is true shows first columns and than rows.

  mt-lv - - method level - `int`
  item-code - - item code - `java.lang.String`
  inda - - INDArray - `org.nd4j.linalg.api.ndarray.INDArray`
  digits - - values digits - `int`
  r-end-i - - rows end index - `int`
  c-end-i - - columns end index - `int`
  turned - - turned rows and columns - `boolean`"
  ([^DataSetUtils this ^Integer mt-lv ^java.lang.String item-code ^org.nd4j.linalg.api.ndarray.INDArray inda ^Integer digits ^Integer r-end-i ^Integer c-end-i ^Boolean turned]
    (-> this (.showINDArray mt-lv item-code inda digits r-end-i c-end-i turned)))
  ([^DataSetUtils this ^Integer mt-lv ^java.lang.String item-code ^org.nd4j.linalg.api.ndarray.INDArray inda ^Integer digits ^Integer r-end-i ^Integer c-end-i]
    (-> this (.showINDArray mt-lv item-code inda digits r-end-i c-end-i))))

