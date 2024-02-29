#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "share_plus_example"
DESCRIPTION = "Demonstrates how to use the share_plus plugin."
AUTHOR = "Flutter Community"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaa4daf7a83c6896af2c007b59db56e4"

SRCREV = "fbc8e61c4f8996d6ba47622de191a83dc2fe1882"
SRC_URI = "git://github.com/fluttercommunity/plus_plugins.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "share_plus_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "fluttercommunity-plus-plugins-packages-share-plus-share-plus-example"
FLUTTER_APPLICATION_PATH = "packages/share_plus/share_plus/example"

inherit flutter-app