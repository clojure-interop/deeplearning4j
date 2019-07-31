(ns org.datavec.api.records.reader.impl.jackson.FieldSelection
  "FieldSelection is used in conjunction with the JacksonRecordReader (and the subclasses).
 The are a few motivations here:
 - Formats such as XML, JSON and YAML can contain arbitrarily nested components, and we need to flatten them somehow
 - These formats can vary in terms of order (for example, JSON is unordered), so we need to define the exact order of outputs for the record reader
 - In any given JSON/XML/YAML file, there might not be a particular value present (but: we still want it to be represented in the output)
 - In any given JSON/XML/YAML file, we might want to totally ignore certain fields"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson FieldSelection]))

(def *-default-missing-value
  "Static Constant.

  type: org.datavec.api.writable.Writable"
  FieldSelection/DEFAULT_MISSING_VALUE)

(defn get-field-paths
  "returns: `java.util.List<java.lang.String[]>`"
  ([^FieldSelection this]
    (-> this (.getFieldPaths))))

(defn get-value-if-missing
  "returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^FieldSelection this]
    (-> this (.getValueIfMissing))))

(defn get-num-fields
  "returns: `int`"
  (^Integer [^FieldSelection this]
    (-> this (.getNumFields))))

