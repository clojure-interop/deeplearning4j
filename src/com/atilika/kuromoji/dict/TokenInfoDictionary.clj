(ns com.atilika.kuromoji.dict.TokenInfoDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict TokenInfoDictionary]))

(defn ->token-info-dictionary
  "Constructor."
  (^TokenInfoDictionary []
    (new TokenInfoDictionary )))

(def *-token-info-dictionary-filename
  "Static Constant.

  type: java.lang.String"
  TokenInfoDictionary/TOKEN_INFO_DICTIONARY_FILENAME)

(def *-feature-map-filename
  "Static Constant.

  type: java.lang.String"
  TokenInfoDictionary/FEATURE_MAP_FILENAME)

(def *-pos-map-filename
  "Static Constant.

  type: java.lang.String"
  TokenInfoDictionary/POS_MAP_FILENAME)

(def *-targetmap-filename
  "Static Constant.

  type: java.lang.String"
  TokenInfoDictionary/TARGETMAP_FILENAME)

(defn *new-instance
  "resolver - `com.atilika.kuromoji.util.ResourceResolver`

  returns: `com.atilika.kuromoji.dict.TokenInfoDictionary`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.dict.TokenInfoDictionary [^com.atilika.kuromoji.util.ResourceResolver resolver]
    (TokenInfoDictionary/newInstance resolver)))

(defn lookup-word-ids
  "source-id - `int`

  returns: `int[]`"
  ([^TokenInfoDictionary this ^Integer source-id]
    (-> this (.lookupWordIds source-id))))

(defn get-left-id
  "Description copied from interface: Dictionary

  word-id - word id to get left id cost for - `int`

  returns: left id cost - `int`"
  (^Integer [^TokenInfoDictionary this ^Integer word-id]
    (-> this (.getLeftId word-id))))

(defn get-right-id
  "Description copied from interface: Dictionary

  word-id - word id to get right id cost for - `int`

  returns: right id cost - `int`"
  (^Integer [^TokenInfoDictionary this ^Integer word-id]
    (-> this (.getRightId word-id))))

(defn get-word-cost
  "Description copied from interface: Dictionary

  word-id - word id to get word cost for - `int`

  returns: word cost - `int`"
  (^Integer [^TokenInfoDictionary this ^Integer word-id]
    (-> this (.getWordCost word-id))))

(defn get-all-features-array
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: Array with all features - `java.lang.String[]`"
  ([^TokenInfoDictionary this ^Integer word-id]
    (-> this (.getAllFeaturesArray word-id))))

(defn get-all-features
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: All features as a string - `java.lang.String`"
  (^java.lang.String [^TokenInfoDictionary this ^Integer word-id]
    (-> this (.getAllFeatures word-id))))

(defn get-feature
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`
  fields - array of feature ids. If this array is empty, all features are returned - `int`

  returns: Array with specified features - `java.lang.String`"
  (^java.lang.String [^TokenInfoDictionary this ^Integer word-id ^Integer fields]
    (-> this (.getFeature word-id fields))))

