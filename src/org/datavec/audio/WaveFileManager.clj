(ns org.datavec.audio.WaveFileManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio WaveFileManager]))

(defn ->wave-file-manager
  "Constructor.

  wave - `org.datavec.audio.Wave`"
  (^WaveFileManager [^org.datavec.audio.Wave wave]
    (new WaveFileManager wave))
  (^WaveFileManager []
    (new WaveFileManager )))

(defn save-wave-as-file
  "Save the wave file

  filename - filename to be saved - `java.lang.String`"
  ([^WaveFileManager this ^java.lang.String filename]
    (-> this (.saveWaveAsFile filename))))

(defn get-wave
  "returns: `org.datavec.audio.Wave`"
  (^org.datavec.audio.Wave [^WaveFileManager this]
    (-> this (.getWave))))

(defn set-wave
  "wave - `org.datavec.audio.Wave`"
  ([^WaveFileManager this ^org.datavec.audio.Wave wave]
    (-> this (.setWave wave))))

