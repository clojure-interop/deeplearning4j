(ns org.datavec.api.transform.analysis.columns.LongAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns LongAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^LongAnalysis$Builder []
    (new LongAnalysis$Builder )))

(defn min
  "min - `long`

  returns: `org.datavec.api.transform.analysis.columns.LongAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.LongAnalysis$Builder [^LongAnalysis$Builder this ^Long min]
    (-> this (.min min))))

(defn max
  "max - `long`

  returns: `org.datavec.api.transform.analysis.columns.LongAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.LongAnalysis$Builder [^LongAnalysis$Builder this ^Long max]
    (-> this (.max max))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.LongAnalysis`"
  (^org.datavec.api.transform.analysis.columns.LongAnalysis [^LongAnalysis$Builder this]
    (-> this (.build))))

