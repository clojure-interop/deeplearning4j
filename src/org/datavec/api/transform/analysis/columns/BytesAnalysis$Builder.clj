(ns org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns BytesAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^BytesAnalysis$Builder []
    (new BytesAnalysis$Builder )))

(defn count-total
  "count-total - `long`

  returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder [^BytesAnalysis$Builder this ^Long count-total]
    (-> this (.countTotal count-total))))

(defn count-null
  "count-null - `long`

  returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder [^BytesAnalysis$Builder this ^Long count-null]
    (-> this (.countNull count-null))))

(defn count-zero-length
  "count-zero-length - `long`

  returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder [^BytesAnalysis$Builder this ^Long count-zero-length]
    (-> this (.countZeroLength count-zero-length))))

(defn min-num-bytes
  "min-num-bytes - `int`

  returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder [^BytesAnalysis$Builder this ^Integer min-num-bytes]
    (-> this (.minNumBytes min-num-bytes))))

(defn max-num-bytes
  "max-num-bytes - `int`

  returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis$Builder [^BytesAnalysis$Builder this ^Integer max-num-bytes]
    (-> this (.maxNumBytes max-num-bytes))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.BytesAnalysis`"
  (^org.datavec.api.transform.analysis.columns.BytesAnalysis [^BytesAnalysis$Builder this]
    (-> this (.build))))

