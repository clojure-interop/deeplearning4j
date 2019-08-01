(ns com.atilika.kuromoji.TokenBase
  "Abstract token class with features shared by all tokens produced by all tokenizers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji TokenBase]))

(defn ->token-base
  "Constructor.

  word-id - `int`
  surface - `java.lang.String`
  type - `com.atilika.kuromoji.viterbi.ViterbiNode$Type`
  position - `int`
  dictionary - `com.atilika.kuromoji.dict.Dictionary`"
  (^TokenBase [^Integer word-id ^java.lang.String surface ^com.atilika.kuromoji.viterbi.ViterbiNode$Type type ^Integer position ^com.atilika.kuromoji.dict.Dictionary dictionary]
    (new TokenBase word-id surface type position dictionary)))

(defn get-surface
  "Gets the surface form of this token (表層形)

  returns: surface form, not null - `java.lang.String`"
  (^java.lang.String [^TokenBase this]
    (-> this (.getSurface))))

(defn known?
  "Predicate indicating whether this token is known (contained in the standard dictionary)

  returns: true if the token is known, otherwise false - `boolean`"
  (^Boolean [^TokenBase this]
    (-> this (.isKnown))))

(defn user?
  "Predicate indicating whether this token is included is from the user dictionary

  If a token is contained both in the user dictionary and standard dictionary, this method will return true

  returns: true if this token is in user dictionary. false if not. - `boolean`"
  (^Boolean [^TokenBase this]
    (-> this (.isUser))))

(defn get-position
  "Gets the position/start index where this token is found in the input text

  returns: token position - `int`"
  (^Integer [^TokenBase this]
    (-> this (.getPosition))))

(defn get-all-features
  "Gets all features for this token as a comma-separated String

  returns: token features, not null - `java.lang.String`"
  (^java.lang.String [^TokenBase this]
    (-> this (.getAllFeatures))))

(defn get-all-features-array
  "Gets all features for this token as a String array

  returns: token feature array, not null - `java.lang.String[]`"
  ([^TokenBase this]
    (-> this (.getAllFeaturesArray))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TokenBase this]
    (-> this (.toString))))

