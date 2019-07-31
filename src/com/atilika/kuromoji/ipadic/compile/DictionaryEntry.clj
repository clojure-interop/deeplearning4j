(ns com.atilika.kuromoji.ipadic.compile.DictionaryEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.ipadic.compile DictionaryEntry]))

(defn ->dictionary-entry
  "Constructor.

  fields - `java.lang.String[]`"
  (^DictionaryEntry [fields]
    (new DictionaryEntry fields)))

(def *-part-of-speech-level-1
  "Static Constant.

  type: int"
  DictionaryEntry/PART_OF_SPEECH_LEVEL_1)

(def *-part-of-speech-level-2
  "Static Constant.

  type: int"
  DictionaryEntry/PART_OF_SPEECH_LEVEL_2)

(def *-part-of-speech-level-3
  "Static Constant.

  type: int"
  DictionaryEntry/PART_OF_SPEECH_LEVEL_3)

(def *-part-of-speech-level-4
  "Static Constant.

  type: int"
  DictionaryEntry/PART_OF_SPEECH_LEVEL_4)

(def *-conjugation-type
  "Static Constant.

  type: int"
  DictionaryEntry/CONJUGATION_TYPE)

(def *-conjugation-form
  "Static Constant.

  type: int"
  DictionaryEntry/CONJUGATION_FORM)

(def *-base-form
  "Static Constant.

  type: int"
  DictionaryEntry/BASE_FORM)

(def *-reading
  "Static Constant.

  type: int"
  DictionaryEntry/READING)

(def *-pronunciation
  "Static Constant.

  type: int"
  DictionaryEntry/PRONUNCIATION)

(def *-total-features
  "Static Constant.

  type: int"
  DictionaryEntry/TOTAL_FEATURES)

(def *-reading-feature
  "Static Constant.

  type: int"
  DictionaryEntry/READING_FEATURE)

(def *-part-of-speech-feature
  "Static Constant.

  type: int"
  DictionaryEntry/PART_OF_SPEECH_FEATURE)

(defn get-base-form
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getBaseForm))))

(defn get-conjugated-form
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getConjugatedForm))))

(defn get-part-of-speech-level-2
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getPartOfSpeechLevel2))))

(defn get-part-of-speech-level-1
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getPartOfSpeechLevel1))))

(defn get-reading
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getReading))))

(defn get-conjugation-type
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getConjugationType))))

(defn get-pronunciation
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getPronunciation))))

(defn get-part-of-speech-level-3
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getPartOfSpeechLevel3))))

(defn get-part-of-speech-level-4
  "returns: `java.lang.String`"
  (^java.lang.String [^DictionaryEntry this]
    (-> this (.getPartOfSpeechLevel4))))

