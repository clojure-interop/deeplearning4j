(ns com.atilika.kuromoji.buffer.FeatureInfoMap
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.buffer FeatureInfoMap]))

(defn ->feature-info-map
  "Constructor."
  (^FeatureInfoMap []
    (new FeatureInfoMap )))

(defn map-features
  "all-pos-features - `java.util.List`

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^FeatureInfoMap this ^java.util.List all-pos-features]
    (-> this (.mapFeatures all-pos-features))))

(defn invert
  "returns: `java.util.TreeMap<java.lang.Integer,java.lang.String>`"
  (^java.util.TreeMap [^FeatureInfoMap this]
    (-> this (.invert))))

(defn get-entry-count
  "returns: `int`"
  (^Integer [^FeatureInfoMap this]
    (-> this (.getEntryCount))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FeatureInfoMap this]
    (-> this (.toString))))

