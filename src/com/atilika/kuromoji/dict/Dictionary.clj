(ns com.atilika.kuromoji.dict.Dictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict Dictionary]))

(defn get-left-id
  "Gets the left id of the specified word

  word-id - word id to get left id cost for - `int`

  returns: left id cost - `int`"
  (^Integer [^Dictionary this ^Integer word-id]
    (-> this (.getLeftId word-id))))

(defn get-right-id
  "Gets the right id of the specified word

  word-id - word id to get right id cost for - `int`

  returns: right id cost - `int`"
  (^Integer [^Dictionary this ^Integer word-id]
    (-> this (.getRightId word-id))))

(defn get-word-cost
  "Gets the word cost of the specified word

  word-id - word id to get word cost for - `int`

  returns: word cost - `int`"
  (^Integer [^Dictionary this ^Integer word-id]
    (-> this (.getWordCost word-id))))

(defn get-all-features
  "Gets all features of the specified word id

  word-id - word id to get features for - `int`

  returns: All features as a string - `java.lang.String`"
  (^java.lang.String [^Dictionary this ^Integer word-id]
    (-> this (.getAllFeatures word-id))))

(defn get-all-features-array
  "Gets all features of the specified word id as a String array

  word-id - word id to get features for - `int`

  returns: Array with all features - `java.lang.String[]`"
  ([^Dictionary this ^Integer word-id]
    (-> this (.getAllFeaturesArray word-id))))

(defn get-feature
  "Gets one or more specific features of a token

  This is an expert API

  word-id - word id to get features for - `int`
  fields - array of feature ids. If this array is empty, all features are returned - `int`

  returns: Array with specified features - `java.lang.String`"
  (^java.lang.String [^Dictionary this ^Integer word-id ^Integer fields]
    (-> this (.getFeature word-id fields))))

