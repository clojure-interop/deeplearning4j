(ns org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState
  "Created by huitseeker on 3/6/17.
 NOTE: this class is not ready for production
 See the BytesQuality class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.bytes BytesQualityAnalysisState]))

(defn ->bytes-quality-analysis-state
  "Constructor."
  (^BytesQualityAnalysisState []
    (new BytesQualityAnalysisState )))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState [^BytesQualityAnalysisState this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState`

  returns: `org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState`"
  (^org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState [^BytesQualityAnalysisState this ^org.datavec.api.transform.analysis.quality.bytes.BytesQualityAnalysisState other]
    (-> this (.merge other))))

(defn get-column-quality
  "returns: `org.datavec.api.transform.quality.columns.ColumnQuality`"
  (^org.datavec.api.transform.quality.columns.ColumnQuality [^BytesQualityAnalysisState this]
    (-> this (.getColumnQuality))))

