(ns com.atilika.kuromoji.dict.UnknownDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict UnknownDictionary]))

(defn ->unknown-dictionary
  "Constructor.

  character-definition - `com.atilika.kuromoji.dict.CharacterDefinitions`
  entries - `int[][]`
  costs - `int[][]`
  features - `java.lang.String[][]`
  total-features - `int`"
  (^UnknownDictionary [^com.atilika.kuromoji.dict.CharacterDefinitions character-definition entries costs features ^Integer total-features]
    (new UnknownDictionary character-definition entries costs features total-features))
  (^UnknownDictionary [^com.atilika.kuromoji.dict.CharacterDefinitions character-definition entries costs features]
    (new UnknownDictionary character-definition entries costs features)))

(def *-unknown-dictionary-filename
  "Static Constant.

  type: java.lang.String"
  UnknownDictionary/UNKNOWN_DICTIONARY_FILENAME)

(defn *new-instance
  "resolver - `com.atilika.kuromoji.util.ResourceResolver`
  character-definitions - `com.atilika.kuromoji.dict.CharacterDefinitions`
  total-features - `int`

  returns: `com.atilika.kuromoji.dict.UnknownDictionary`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.dict.UnknownDictionary [^com.atilika.kuromoji.util.ResourceResolver resolver ^com.atilika.kuromoji.dict.CharacterDefinitions character-definitions ^Integer total-features]
    (UnknownDictionary/newInstance resolver character-definitions total-features)))

(defn lookup-word-ids
  "category-id - `int`

  returns: `int[]`"
  ([^UnknownDictionary this ^Integer category-id]
    (-> this (.lookupWordIds category-id))))

(defn get-left-id
  "Description copied from interface: Dictionary

  word-id - word id to get left id cost for - `int`

  returns: left id cost - `int`"
  (^Integer [^UnknownDictionary this ^Integer word-id]
    (-> this (.getLeftId word-id))))

(defn get-right-id
  "Description copied from interface: Dictionary

  word-id - word id to get right id cost for - `int`

  returns: right id cost - `int`"
  (^Integer [^UnknownDictionary this ^Integer word-id]
    (-> this (.getRightId word-id))))

(defn get-word-cost
  "Description copied from interface: Dictionary

  word-id - word id to get word cost for - `int`

  returns: word cost - `int`"
  (^Integer [^UnknownDictionary this ^Integer word-id]
    (-> this (.getWordCost word-id))))

(defn get-all-features
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: All features as a string - `java.lang.String`"
  (^java.lang.String [^UnknownDictionary this ^Integer word-id]
    (-> this (.getAllFeatures word-id))))

(defn get-all-features-array
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`

  returns: Array with all features - `java.lang.String[]`"
  ([^UnknownDictionary this ^Integer word-id]
    (-> this (.getAllFeaturesArray word-id))))

(defn get-feature
  "Description copied from interface: Dictionary

  word-id - word id to get features for - `int`
  fields - array of feature ids. If this array is empty, all features are returned - `int`

  returns: Array with specified features - `java.lang.String`"
  (^java.lang.String [^UnknownDictionary this ^Integer word-id ^Integer fields]
    (-> this (.getFeature word-id fields))))

(defn get-character-definition
  "returns: `com.atilika.kuromoji.dict.CharacterDefinitions`"
  (^com.atilika.kuromoji.dict.CharacterDefinitions [^UnknownDictionary this]
    (-> this (.getCharacterDefinition))))

