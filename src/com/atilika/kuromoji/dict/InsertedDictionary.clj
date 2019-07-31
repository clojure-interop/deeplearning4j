(ns com.atilika.kuromoji.dict.InsertedDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict InsertedDictionary]))

(defn ->inserted-dictionary
  "Constructor.

  features - `int`"
  (^InsertedDictionary [^Integer features]
    (new InsertedDictionary features)))

(defn get-left-id
  "Description copied from interface: Dictionary

  word-id - word id to get left id cost for - `int`

  returns: left id cost - `int`"
  (^Integer [^InsertedDictionary this ^Integer word-id]
    (-> this (.getLeftId word-id))))

(defn get-right-id
  "Description copied from interface: Dictionary

  word-id - word id to get right id cost for - `int`

  returns: right id cost - `int`"
  (^Integer [^InsertedDictionary this ^Integer word-id]
    (-> this (.getRightId word-id))))

(defn get-word-cost
  "Description copied from interface: Dictionary

  word-id - word id to get word cost for - `int`

  returns: word cost - `int`"
  (^Integer [^InsertedDictionary this ^Integer word-id]
    (-> this (.getWordCost word-id))))

(defn get-all-features
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: All features as a string - `java.lang.String`"
  (^java.lang.String [^InsertedDictionary this ^Integer word-id]
    (-> this (.getAllFeatures word-id))))

(defn get-all-features-array
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: Array with all features - `java.lang.String[]`"
  ([^InsertedDictionary this ^Integer word-id]
    (-> this (.getAllFeaturesArray word-id))))

(defn get-feature
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`
  fields - array of feature ids. If this array is empty, all features are returned - `int`

  returns: Array with specified features - `java.lang.String`"
  (^java.lang.String [^InsertedDictionary this ^Integer word-id ^Integer fields]
    (-> this (.getFeature word-id fields))))

