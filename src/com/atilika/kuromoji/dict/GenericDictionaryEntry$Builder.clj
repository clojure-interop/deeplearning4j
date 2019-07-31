(ns com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict GenericDictionaryEntry$Builder]))

(defn ->builder
  "Constructor."
  (^GenericDictionaryEntry$Builder []
    (new GenericDictionaryEntry$Builder )))

(defn surface
  "surface - `java.lang.String`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^java.lang.String surface]
    (-> this (.surface surface))))

(defn left-id
  "left-id - `short`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^Short left-id]
    (-> this (.leftId left-id))))

(defn right-id
  "right-id - `short`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^Short right-id]
    (-> this (.rightId right-id))))

(defn word-cost
  "word-cost - `short`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^Short word-cost]
    (-> this (.wordCost word-cost))))

(defn pos
  "pos - `java.util.List`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^java.util.List pos]
    (-> this (.pos pos))))

(defn features
  "features - `java.util.List`

  returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry$Builder [^GenericDictionaryEntry$Builder this ^java.util.List features]
    (-> this (.features features))))

(defn build
  "returns: `com.atilika.kuromoji.dict.GenericDictionaryEntry`"
  (^com.atilika.kuromoji.dict.GenericDictionaryEntry [^GenericDictionaryEntry$Builder this]
    (-> this (.build))))

