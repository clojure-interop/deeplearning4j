(ns org.datavec.audio.fingerprint.FingerprintSimilarity
  "A class for fingerprint's similarity"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint FingerprintSimilarity]))

(defn ->fingerprint-similarity
  "Constructor.

  Constructor"
  (^FingerprintSimilarity []
    (new FingerprintSimilarity )))

(defn get-most-similar-frame-position
  "Get the most similar position in terms of frame number

  returns: most similar frame position - `int`"
  (^Integer [^FingerprintSimilarity this]
    (-> this (.getMostSimilarFramePosition))))

(defn set-most-similar-frame-position
  "Set the most similar position in terms of frame number

  most-similar-frame-position - `int`"
  ([^FingerprintSimilarity this ^Integer most-similar-frame-position]
    (-> this (.setMostSimilarFramePosition most-similar-frame-position))))

(defn get-similarity
  "Get the similarity of the fingerprints
  similarity from 0~1, which 0 means no similar feature is found and 1 means in average there is at least one match in every frame

  returns: fingerprints similarity - `float`"
  (^Float [^FingerprintSimilarity this]
    (-> this (.getSimilarity))))

(defn set-similarity
  "Set the similarity of the fingerprints

  similarity - similarity - `float`"
  ([^FingerprintSimilarity this ^Float similarity]
    (-> this (.setSimilarity similarity))))

(defn get-score
  "Get the similarity score of the fingerprints
  Number of features found in the fingerprints per frame

  returns: fingerprints similarity score - `float`"
  (^Float [^FingerprintSimilarity this]
    (-> this (.getScore))))

(defn set-score
  "Set the similarity score of the fingerprints

  score - `float`"
  ([^FingerprintSimilarity this ^Float score]
    (-> this (.setScore score))))

(defn getset-most-similar-time-position
  "Get the most similar position in terms of time in second

  returns: most similar starting time - `float`"
  (^Float [^FingerprintSimilarity this]
    (-> this (.getsetMostSimilarTimePosition))))

