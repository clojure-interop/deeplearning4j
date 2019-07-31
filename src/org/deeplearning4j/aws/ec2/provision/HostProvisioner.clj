(ns org.deeplearning4j.aws.ec2.provision.HostProvisioner
  "Meant for uploading files to remote servers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.ec2.provision HostProvisioner]))

(defn ->host-provisioner
  "Constructor.

  Connects to port 22

  host - host to connect to (public facing dns) - `java.lang.String`
  user - the user to connect with (default root otherwise) - `java.lang.String`
  password - the password to use if any - `java.lang.String`"
  (^HostProvisioner [^java.lang.String host ^java.lang.String user ^java.lang.String password]
    (new HostProvisioner host user password))
  (^HostProvisioner [^java.lang.String host ^java.lang.String user]
    (new HostProvisioner host user))
  (^HostProvisioner [^java.lang.String host]
    (new HostProvisioner host))
  (^HostProvisioner [^java.lang.String host ^java.lang.String user ^java.lang.String password ^Integer port]
    (new HostProvisioner host user password port)))

(defn upload-for-deployment
  "Creates the directory for the file if necessary
  and uploads the file

  from - the directory to upload from - `java.lang.String`
  to - the destination directory on the remote server - `java.lang.String`

  throws: java.lang.Exception"
  ([^HostProvisioner this ^java.lang.String from ^java.lang.String to]
    (-> this (.uploadForDeployment from to))))

(defn run-remote-command
  "remote-command - `java.lang.String`

  throws: java.lang.Exception"
  ([^HostProvisioner this ^java.lang.String remote-command]
    (-> this (.runRemoteCommand remote-command))))

(defn add-key-file
  "key-file - `java.lang.String`

  throws: java.lang.Exception"
  ([^HostProvisioner this ^java.lang.String key-file]
    (-> this (.addKeyFile key-file))))

(defn prompt-password
  "arg-0 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^HostProvisioner this ^java.lang.String arg-0]
    (-> this (.promptPassword arg-0))))

(defn upload-and-run
  "script - `java.lang.String`
  root-dir - `java.lang.String`

  throws: java.lang.Exception"
  ([^HostProvisioner this ^java.lang.String script ^java.lang.String root-dir]
    (-> this (.uploadAndRun script root-dir))))

(defn prompt-passphrase
  "arg-0 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^HostProvisioner this ^java.lang.String arg-0]
    (-> this (.promptPassphrase arg-0))))

(defn prompt-yes-no
  "arg-0 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^HostProvisioner this ^java.lang.String arg-0]
    (-> this (.promptYesNo arg-0))))

(defn show-message
  "arg-0 - `java.lang.String`"
  ([^HostProvisioner this ^java.lang.String arg-0]
    (-> this (.showMessage arg-0))))

(defn get-password
  "returns: `java.lang.String`"
  (^java.lang.String [^HostProvisioner this]
    (-> this (.getPassword))))

(defn get-passphrase
  "returns: `java.lang.String`"
  (^java.lang.String [^HostProvisioner this]
    (-> this (.getPassphrase))))

