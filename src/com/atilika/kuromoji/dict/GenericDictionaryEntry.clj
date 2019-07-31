(ns com.atilika.kuromoji.dict.GenericDictionaryEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict GenericDictionaryEntry]))

(defn ->generic-dictionary-entry
  "Constructor.

  builder - `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^GenericDictionaryEntry [^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder builder]
    (new GenericDictionaryEntry builder)))

(defn get-pos-features
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GenericDictionaryEntry this]
    (-> this (.getPosFeatures))))

(defn get-features
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GenericDictionaryEntry this]
    (-> this (.getFeatures))))

