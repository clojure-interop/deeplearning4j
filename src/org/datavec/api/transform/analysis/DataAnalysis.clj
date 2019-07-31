(ns org.datavec.api.transform.analysis.DataAnalysis
  "The DataAnalysis class represents analysis (summary statistics) for a data set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis DataAnalysis]))

(defn *from-json
  "Deserialize a JSON DataAnalysis String that was previously serialized with toJson()

  json - `java.lang.String`

  returns: `org.datavec.api.transform.analysis.DataAnalysis`"
  (^org.datavec.api.transform.analysis.DataAnalysis [^java.lang.String json]
    (DataAnalysis/fromJson json)))

(defn *from-yaml
  "Deserialize a YAML DataAnalysis String that was previously serialized with toYaml()

  yaml - `java.lang.String`

  returns: `org.datavec.api.transform.analysis.DataAnalysis`"
  (^org.datavec.api.transform.analysis.DataAnalysis [^java.lang.String yaml]
    (DataAnalysis/fromYaml yaml)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataAnalysis this]
    (-> this (.toString))))

(defn get-column-analysis
  "column - `java.lang.String`

  returns: `org.datavec.api.transform.analysis.columns.ColumnAnalysis`"
  (^org.datavec.api.transform.analysis.columns.ColumnAnalysis [^DataAnalysis this ^java.lang.String column]
    (-> this (.getColumnAnalysis column))))

(defn to-json
  "Convert the DataAnalysis object to JSON format

  returns: `java.lang.String`"
  (^java.lang.String [^DataAnalysis this]
    (-> this (.toJson))))

(defn to-yaml
  "Convert the DataAnalysis object to YAML format

  returns: `java.lang.String`"
  (^java.lang.String [^DataAnalysis this]
    (-> this (.toYaml))))

