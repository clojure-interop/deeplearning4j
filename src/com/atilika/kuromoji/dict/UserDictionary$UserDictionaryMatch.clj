(ns com.atilika.kuromoji.dict.UserDictionary$UserDictionaryMatch
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict UserDictionary$UserDictionaryMatch]))

(defn ->user-dictionary-match
  "Constructor.

  word-id - `int`
  match-start-index - `int`
  match-length - `int`"
  (^UserDictionary$UserDictionaryMatch [^Integer word-id ^Integer match-start-index ^Integer match-length]
    (new UserDictionary$UserDictionaryMatch word-id match-start-index match-length)))

(defn get-word-id
  "returns: `int`"
  (^Integer [^UserDictionary$UserDictionaryMatch this]
    (-> this (.getWordId))))

(defn get-match-start-index
  "returns: `int`"
  (^Integer [^UserDictionary$UserDictionaryMatch this]
    (-> this (.getMatchStartIndex))))

(defn get-match-length
  "returns: `int`"
  (^Integer [^UserDictionary$UserDictionaryMatch this]
    (-> this (.getMatchLength))))

