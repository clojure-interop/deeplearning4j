(ns org.datavec.audio.fingerprint.PairManager
  "Make pairs for the audio fingerprints, which a pair is used to group the same features together"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint PairManager]))

(defn ->pair-manager
  "Constructor.

  Constructor, number of pairs of robust points depends on the parameter isReferencePairing
  no. of pairs of reference and sample can be different due to environmental influence of source

  is-reference-pairing - `boolean`"
  (^PairManager [^Boolean is-reference-pairing]
    (new PairManager is-reference-pairing))
  (^PairManager []
    (new PairManager )))

(defn *pair-hashcode-to-bytes
  "Convert hashed pair to bytes

  pair-hashcode - hashed pair - `int`

  returns: byte array - `byte[]`"
  ([^Integer pair-hashcode]
    (PairManager/pairHashcodeToBytes pair-hashcode)))

(defn *pair-bytes-to-hashcode
  "Convert bytes to hased pair

  pair-bytes - `byte[]`

  returns: hashed pair - `int`"
  (^Integer [pair-bytes]
    (PairManager/pairBytesToHashcode pair-bytes)))

(defn get-pair-position-list-table
  "Get a pair-positionList table
  It's a hash map which the key is the hashed pair, and the value is list of positions
  That means the table stores the positions which have the same hashed pair

  fingerprint - fingerprint bytes - `byte[]`

  returns: pair-positionList HashMap - `java.util.HashMap<java.lang.Integer,java.util.List<java.lang.Integer>>`"
  (^java.util.HashMap [^PairManager this fingerprint]
    (-> this (.getPair_PositionList_Table fingerprint))))

