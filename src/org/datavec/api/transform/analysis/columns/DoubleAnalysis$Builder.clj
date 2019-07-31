(ns org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns DoubleAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^DoubleAnalysis$Builder []
    (new DoubleAnalysis$Builder )))

(defn min
  "min - `double`

  returns: `org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder [^DoubleAnalysis$Builder this ^Double min]
    (-> this (.min min))))

(defn max
  "max - `double`

  returns: `org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder [^DoubleAnalysis$Builder this ^Double max]
    (-> this (.max max))))

(defn count-na-n
  "count-na-n - `long`

  returns: `org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.DoubleAnalysis$Builder [^DoubleAnalysis$Builder this ^Long count-na-n]
    (-> this (.countNaN count-na-n))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.DoubleAnalysis`"
  (^org.datavec.api.transform.analysis.columns.DoubleAnalysis [^DoubleAnalysis$Builder this]
    (-> this (.build))))

