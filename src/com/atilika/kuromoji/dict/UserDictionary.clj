(ns com.atilika.kuromoji.dict.UserDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict UserDictionary]))

(defn ->user-dictionary
  "Constructor.

  input-stream - `java.io.InputStream`
  total-features - `int`
  reading-feature - `int`
  part-of-speech-feature - `int`

  throws: java.io.IOException"
  (^UserDictionary [^java.io.InputStream input-stream ^Integer total-features ^Integer reading-feature ^Integer part-of-speech-feature]
    (new UserDictionary input-stream total-features reading-feature part-of-speech-feature)))

(defn get-all-features
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: All features as a string - `java.lang.String`"
  (^java.lang.String [^UserDictionary this ^Integer word-id]
    (-> this (.getAllFeatures word-id))))

(defn get-feature
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`
  fields - array of feature ids. If this array is empty, all features are returned - `int`

  returns: Array with specified features - `java.lang.String`"
  (^java.lang.String [^UserDictionary this ^Integer word-id ^Integer fields]
    (-> this (.getFeature word-id fields))))

(defn get-word-cost
  "Description copied from interface: Dictionary

  word-id - word id to get word cost for - `int`

  returns: word cost - `int`"
  (^Integer [^UserDictionary this ^Integer word-id]
    (-> this (.getWordCost word-id))))

(defn read
  "input - `java.io.InputStream`

  throws: java.io.IOException"
  ([^UserDictionary this ^java.io.InputStream input]
    (-> this (.read input))))

(defn get-left-id
  "Description copied from interface: Dictionary

  word-id - word id to get left id cost for - `int`

  returns: left id cost - `int`"
  (^Integer [^UserDictionary this ^Integer word-id]
    (-> this (.getLeftId word-id))))

(defn add-entry
  "entry - `java.lang.String`"
  ([^UserDictionary this ^java.lang.String entry]
    (-> this (.addEntry entry))))

(defn get-right-id
  "Description copied from interface: Dictionary

  word-id - word id to get right id cost for - `int`

  returns: right id cost - `int`"
  (^Integer [^UserDictionary this ^Integer word-id]
    (-> this (.getRightId word-id))))

(defn find-user-dictionary-matches
  "Lookup words in text

  text - text to look up user dictionary matches for - `java.lang.String`

  returns: list of UserDictionaryMatch, not null - `java.util.List<com.atilika.kuromoji.dict.UserDictionary$UserDictionaryMatch>`"
  (^java.util.List [^UserDictionary this ^java.lang.String text]
    (-> this (.findUserDictionaryMatches text))))

(defn get-all-features-array
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: Array with all features - `java.lang.String[]`"
  ([^UserDictionary this ^Integer word-id]
    (-> this (.getAllFeaturesArray word-id))))

