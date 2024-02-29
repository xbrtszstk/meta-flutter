#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "bookstore"
DESCRIPTION = "Navigation and routing sample app"
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "5fb4798ae569d39d54a5e19312e92be13b4e2984"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "bookstore"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-navigation-and-routing-bookstore"
FLUTTER_APPLICATION_PATH = "navigation_and_routing"

inherit flutter-app