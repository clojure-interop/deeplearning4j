(ns org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.integer IntegerQualityAnalysisState]))

(defn ->integer-quality-analysis-state
  "Constructor.

  integer-meta-data - `org.datavec.api.transform.metadata.IntegerMetaData`"
  (^IntegerQualityAnalysisState [^org.datavec.api.transform.metadata.IntegerMetaData integer-meta-data]
    (new IntegerQualityAnalysisState integer-meta-data)))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState [^IntegerQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState [^IntegerQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.integer.IntegerQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^IntegerQualityAnalysisState this]
    (-> this (.getColumnQuality))))

