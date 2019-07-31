(ns org.datavec.audio.fingerprint.FingerprintSimilarityComputer
  "Compute the similarity of two fingerprints"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint FingerprintSimilarityComputer]))

(defn ->fingerprint-similarity-computer
  "Constructor.

  Constructor, ready to compute the similarity of two fingerprints

  fingerprint-1 - `byte[]`
  fingerprint-2 - `byte[]`"
  (^FingerprintSimilarityComputer [fingerprint-1 fingerprint-2]
    (new FingerprintSimilarityComputer fingerprint-1 fingerprint-2)))

(defn get-fingerprints-similarity
  "Get fingerprint similarity of inout fingerprints

  returns: fingerprint similarity object - `org.datavec.audio.fingerprint.FingerprintSimilarity`"
  (^org.datavec.audio.fingerprint.FingerprintSimilarity [^FingerprintSimilarityComputer this]
    (-> this (.getFingerprintsSimilarity))))

