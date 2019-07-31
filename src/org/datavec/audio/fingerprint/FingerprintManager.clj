(ns org.datavec.audio.fingerprint.FingerprintManager
  "Audio fingerprint manager, handle fingerprint operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint FingerprintManager]))

(defn ->fingerprint-manager
  "Constructor.

  Constructor"
  (^FingerprintManager []
    (new FingerprintManager )))

(defn *get-num-frames
  "Number of frames in a fingerprint
  Each frame lengths 8 bytes
  Usually there is more than one point in each frame, so it cannot simply divide the bytes length by 8
  Last 8 byte of thisFingerprint is the last frame of this wave
  First 2 byte of the last 8 byte is the x position of this wave, i.e. (number_of_frames-1) of this wave

  fingerprint - fingerprint bytes - `byte[]`

  returns: number of frames of the fingerprint - `int`"
  (^Integer [fingerprint]
    (FingerprintManager/getNumFrames fingerprint)))

(defn extract-fingerprint
  "Extract fingerprint from Wave object

  wave - Wave Object to be extracted fingerprint - `org.datavec.audio.Wave`

  returns: fingerprint in bytes - `byte[]`"
  ([^FingerprintManager this ^org.datavec.audio.Wave wave]
    (-> this (.extractFingerprint wave))))

(defn get-fingerprint-from-file
  "Get bytes from fingerprint file

  fingerprint-file - fingerprint filename - `java.lang.String`

  returns: fingerprint in bytes - `byte[]`"
  ([^FingerprintManager this ^java.lang.String fingerprint-file]
    (-> this (.getFingerprintFromFile fingerprint-file))))

(defn get-fingerprint-from-input-stream
  "Get bytes from fingerprint inputstream

  input-stream - fingerprint inputstream - `java.io.InputStream`

  returns: fingerprint in bytes - `byte[]`"
  ([^FingerprintManager this ^java.io.InputStream input-stream]
    (-> this (.getFingerprintFromInputStream input-stream))))

(defn save-fingerprint-as-file
  "Save fingerprint to a file

  fingerprint - fingerprint bytes - `byte[]`
  filename - fingerprint filename - `java.lang.String`"
  ([^FingerprintManager this fingerprint ^java.lang.String filename]
    (-> this (.saveFingerprintAsFile fingerprint filename))))

