(ns org.datavec.api.transform.analysis.columns.IntegerAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns IntegerAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^IntegerAnalysis$Builder []
    (new IntegerAnalysis$Builder )))

(defn min
  "min - `int`

  returns: `org.datavec.api.transform.analysis.columns.IntegerAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.IntegerAnalysis$Builder [^IntegerAnalysis$Builder this ^Integer min]
    (-> this (.min min))))

(defn max
  "max - `int`

  returns: `org.datavec.api.transform.analysis.columns.IntegerAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.IntegerAnalysis$Builder [^IntegerAnalysis$Builder this ^Integer max]
    (-> this (.max max))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.IntegerAnalysis`"
  (^org.datavec.api.transform.analysis.columns.IntegerAnalysis [^IntegerAnalysis$Builder this]
    (-> this (.build))))

