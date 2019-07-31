(ns org.datavec.api.transform.analysis.columns.TimeAnalysis$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.columns TimeAnalysis$Builder]))

(defn ->builder
  "Constructor."
  (^TimeAnalysis$Builder []
    (new TimeAnalysis$Builder )))

(defn min
  "min - `long`

  returns: `org.datavec.api.transform.analysis.columns.TimeAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.TimeAnalysis$Builder [^TimeAnalysis$Builder this ^Long min]
    (-> this (.min min))))

(defn max
  "max - `long`

  returns: `org.datavec.api.transform.analysis.columns.TimeAnalysis$Builder`"
  (^org.datavec.api.transform.analysis.columns.TimeAnalysis$Builder [^TimeAnalysis$Builder this ^Long max]
    (-> this (.max max))))

(defn build
  "returns: `org.datavec.api.transform.analysis.columns.TimeAnalysis`"
  (^org.datavec.api.transform.analysis.columns.TimeAnalysis [^TimeAnalysis$Builder this]
    (-> this (.build))))

