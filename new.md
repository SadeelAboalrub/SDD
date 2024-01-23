# User Guide for Joomla

## Introduction

### Overview of the Software

Joomla is an open-source content management system (CMS) designed for creating dynamic websites and applications. Joomla has gained widespread popularity for its user-friendly interface and robust features, making it a top choice for both beginners and experienced web developers. As of [2023], Joomla is at version 3.5. Make sure to check for any recent updates or new features that might enhance your website-building experience.

### Purpose of the User Guide

This guide aims to provide comprehensive instructions and insights into utilizing Joomla efficiently, ensuring users can maximize the potential of the software.

### Target Audience and Prerequisites

- **Target Audience:** Users with varying levels of technical expertise interested in website development.
- **Prerequisites:** Basic understanding of web development concepts.

## User Interface Overview

### Description of the Main Interface

Joomla's interface is designed with user-friendliness in mind, featuring key elements like the Dashboard, Menus and Buttons, and Interactive Components. The interface is highly customizable, allowing users to tailor it.


### Explanation of Menus, Buttons, Icons, and Components

Understanding the various interactive elements within Joomla is crucial for effective website management. Below, we delve into the purposes and functionalities of key menus, buttons, icons, and components:

#### 1. Menus
Joomla features a hierarchical menu structure that governs site navigation. The primary menu types include:
- **Main Menu:** The central navigation menu, typically displayed prominently on the site.
- **Top Menu:** Positioned at the top of the page, offering additional navigation options.
- **User Menu:** Tailored for registered users, providing personalized links.

#### 2. Buttons
Buttons play a vital role in performing actions within the Joomla interface. Common buttons include:
- **Save:** Commits changes made to settings or content.
- **Apply:** Applies changes without closing the editing interface.
- **Cancel:** Discards changes and exits the editing interface.

#### 3. Icons
Icons are visual representations that convey specific actions or statuses. Key icons include:
- :house: **Home Icon:** Navigates back to the home page.
- :pencil2: **Edit Icon:** Indicates the ability to edit content.
- :eye: **Publish/Unpublish Icon:** Toggles the visibility of content.
- :trash: **Trash Icon:** Deletes selected items.

#### 4. Components
Joomla components are modular extensions that enhance site functionality. Noteworthy components include:
- **Content Management:** Manages articles, categories, and featured content.
- **Extensions:** Facilitates the installation and configuration of plugins, modules, and templates.
- **User Management:** Controls user registration, authentication, and permissions.
- **Menus:** Defines the site's navigational structure.

#### 5. Toolbar
The toolbar, positioned at the top of the administration interface, contains quick-access buttons for essential tasks. It streamlines the user experience by providing shortcuts to common actions.

Understanding the role of menus, buttons, icons, and components empowers users to navigate the Joomla interface seamlessly. Regular interaction with these elements contributes to efficient content management and site administration.


## Features and Functionality

### Step-by-Step Guides with Screenshots

#### Step 1: First you need to Download Joomla latest version and extract in web root folder.

Visit the [official Joomla website](http://localhost/project/) and download the latest version of Joomla.

#### Step 2: Next we will configure files permission and ownerships. we alter a couple of permissions to give access to the Joomla installer.
First create a Joomla configuration file and make it temporarily world-writeable. 
After the installation is complete, we will change the permissions back down to 755, which will make it only writeable by the owner.

#### Step 3: Create Database and give permission
Now we need to create a new MySQL database for Joomla site.
Login using your MySQL root password. We then need to create the Joomla database, a user in that database, and give that user a new password. Keep in mind that all MySQL commands must end with semi-colon. We can also configure this new database with root user but this is not a good option for security and when you have multiple sites on a server.

#### Step 4: Configure Apache

Point your domain to this server ip and configure apache by editing below file.

#### Step 5: Next step is to Enter from browser hit your website then one window display as seen below.

Now, Continue with the following procedure.
![ Main configuration](https://github.com/SadeelAboalrub/SDD/blob/6fcdcd87ca9828459d5b4d0e3f49fc332f151c6b/cms-pics/2.1.png)

![ Database configuration](https://github.com/SadeelAboalrub/SDD/blob/6fcdcd87ca9828459d5b4d0e3f49fc332f151c6b/cms-pics/2.2.png)

![Overview](https://github.com/SadeelAboalrub/SDD/blob/6fcdcd87ca9828459d5b4d0e3f49fc332f151c6b/cms-pics/2.3.png)
![](https://github.com/SadeelAboalrub/SDD/blob/6fcdcd87ca9828459d5b4d0e3f49fc332f151c6b/cms-pics/2.4.png)
![](https://github.com/SadeelAboalrub/SDD/blob/6fcdcd87ca9828459d5b4d0e3f49fc332f151c6b/cms-pics/2.5.png)


#### Step 6: Access Joomla Admin

Log in to the Joomla administrator panel to start managing your website.

Congratulations! You have successfully installed Joomla. Feel free to explore and customize your website.

### Commonly Used Features
Joomla! Essential
-  Multilingual : Offering over 70 languages.
-  Search Engine Optimization: Out of the box SEO & SEF.
-  Flexible : Make a blog, business website, intranet, community website… From the simplest to the most complex website.
-  Free forever : Joomla! is free to use under GPL.
-  Extendable: Over 8,000 extensions are available to extend your website and broaden its functionality.
-  User Management (ACL) : ACL stands for Access Control List, it allows you to manage the users of your site, and different groups.
-  Menu management : Create as many menus and menu items as you need.
- Cache Management : Speed up your website with caching.

Awesome design features 
- Template override: Achieve superior custom designs.
- Jlayouts: Allows you to render HTML from objects/arrays of data.
- Template assignment: Assign specific templates to specific pages.
- Responsive: Joomla! uses Bootstrap for perfect responsive designs.
- Do more with Less: Joomla! features LESS CSS.
- Template frameworks: Use external template frameworks or template clubs.
- Create your own: You’re able to create your own template. The only limit is your imagination.

CMS Management made easy 
- Easy core update: Keep your Joomla! up to date with 1 click.
- Easy extensions update: Keep your extensions up to date easily and fast.
- Install from web: Install extensions without leaving your backend.
- User registration: Allow visitors to register and gain access to additional resources.



### Standout Features

Joomla's powerful ACL (Access Control List) system allows you to finely control what users can see and do on your site. Take advantage of the flexible modular architecture for dynamic content presentation.


### Security Features and Settings

### Configuring Joomla!

#### Install official versions of Joomla!

- To avoid breaking your site, search the forums for reports of incompatible extensions before upgrading to a new version of Joomla.
- Upgrade to the latest stable version of Joomla! as soon as possible.
- Download Joomla! from official sites only,  and check the MD5 hash.
- Use Web Page Diagnostic Tools, i.e. Firefox Developer Tools, Microsoft Edge (Chromium) Developer Tools, Chrome Developer Tools, etc. to ensure that all files were installed correctly.

#### Change the default administrator username

- Change the user name of the default admin user. This simple step effectively increases the security of this critical account by modifying one of the two variables attackers must know to gain access. The password is the other variable. Change it early and often. (FAQ)

#### Protect directories and files

- Ensure that all configurable paths to writable or uploadable directories (document repositories, image galleries, caches) are outside of public_html.
- Check third party extensions such as DOCMan and Gallery2 for editable paths to writable directories.
  - Joomla 1.5 - Joomla 2.5 - Joomla 3.x - Joomla 4.x: In the Back-End Global Configuration, change the log path.
  - Joomla 1.5 - Joomla 2.5 - Joomla 3.x - Joomla 4.x: In the Back-End Global Configuration, change the temp folder path.
  - If the log and temp paths are changed and PHP open_basedir configuration directive is set, make sure that the new paths fall within the scope of open_basedir.

#### Adjust file and directory permissions

- This option no longer appears in Joomla. On Older versions of Joomla: Once your site is configured and stable, write-protect critical directories and files by changing directory permissions to 755, and file permissions to 644.
- There is a feature in Site --> Global Configuration --> Server to set all folder and file permissions at once.
- Test third party extensions afterward, and carefully review the code of any extension that has trouble with such settings.
- Note: Depending on your server's permissions, you may need to temporarily reset to more open permissions when installing more extensions with the Joomla! installer. This option no longer appears in Joomla. but is included for historical purposes.

#### Remove unneeded files

- Remove all design templates not needed by your site. Never put security logic into template files.
- Joomla 1.5: Disable the XML-RPC server if you don't need it.
- Clean up after installs. The installation process will require you to delete the installation directory and all its contents. Do this; do not simply rename it.
- If you upload files to your site as compressed archives (xxxx.zip for example), don't forget to remove the compressed file.
- Check the /temp/ directory as temporary files may remain there after a failed installation attempt.

#### Turn Register Globals Emulation OFF

- Joomla 1.0: Turn Joomla's Register Globals Emulation OFF. Although this setting is somewhat safer than PHP register_globals, you are much better off avoiding such settings altogether (as well as any applications that require them).
- Joomla 1.5 - Joomla 2.5 - Joomla 3.x: Joomla 1.5 and greater, does not use register globals, and in fact has smart code to defeat this setting even if it's turned on at the PHP level.
  - Note that although this makes Joomla itself safer, any server with register globals turned on is potentially vulnerable.

#### Installing Joomla! Extensions

#### Backup before installing

- Before installing extensions, always backup your site's files and database. This follows a very basic principle:
  - Thou shalt at all times be able to return your site to a previous working state.
  - Therefore, it's smart to set up a simple and fast backup script to automate this task. If you don't set up an easy process in advance, you'll be sorely tempted to do a quick upgrade without backing up first. This very understandable tendency is, however, one of the chief causes of premature hair loss, sudden career changes, and even death.

#### Check for extension vulnerabilities

- Most security vulnerabilities are caused by third party extensions. Before installing extensions, check the Official List of Vulnerable 3rd Party/Non Joomla! Extensions.
  - There's an entire site dedicated to vulnerable third party extensions at joomla we recommend you keep an eye on it!

#### Download from trusted sites

- The fully qualified and official definition of a "trusted site" is one that YOU trust.
  - User beware!

#### Check the code quality

- Third party extensions come in all flavors of quality and age. Although Joomla! coding standards exist, third party developers are not required to follow them.
  - Extensions listed on the official Joomla! site are not reviewed for compliance, however if verified vulnerabilities are reported, they will be removed from the list until they are fixed.

#### Test, test, test...

- Test all extensions on a development site before installing on a production site. Then test on the production site.
  - Don't forget to check the logs for runtime errors and warnings.

#### Remove junk files

- Remove all unused extensions and double-check that related folders and files were actually removed by uninstall scripts.
  - Note that during uninstall, many third party extensions will leave related files on your site, and related database tables complete with data.

#### Avoid encrypted code

- Joomla is (and despite disinformation campaigns, always has been) a GNU GPL project.
  - This means that all extensions to Joomla must also be free (as in freedom) and open (as in readable code).
  - Encrypted code may be safe, but you can't determine this for yourself, and so you must trust the developers.

#### Additional Joomla! Hardening Tips and Tricks

#### Running on a non-vhost environment

- When you are running Joomla on a non-vhost environment please make sure that you set the live_site setting within the configuration.php to your domain to protect you against potential Host Header Injection.
  - All sites that are running within a vhost setup are not affected by this issue.

#### Avoid shared servers if possible

- For maximum security, avoid a shared server on which you don't know or can't trust all the other users or their code quality.

#### Enable SSL on your server

- Servers with SSL correctly configured are currently the only way to securely process confidential transactions and secure user authentication.
  - SSL works by encrypting all HTTP communications between the Web server and Web clients.
  - Thus, even if a transmission is intercepted, it cannot be read.
  - Joomla! 1.0.x does not allow you to assign an SSL server to individual sub-directories. Search the forums for "Tommy Hack" for one way to deal with this.
  - Joomla! 1.5 and higher supports the configuration of SSL options out of the box.

#### Use Apache's .htaccess

- For an additional layer of password protection, you can use .htaccess to password protect critical directories.
  - This is usually adequate for blocking the typical script kiddie, but be aware that .htaccess password protection alone is not a highly secure method.
  - It MUST be combined with an SSL server for maximum protection.
  - An SSL server is required for protecting your site from more sophisticated

## Support and Contact Information

### Customer Support Contact Details

For any inquiries or issues, users can contact our customer support team at [support link]. Our experts are ready to assist you with any challenges you may encounter.

### Online Resources

- **Video Demonstration:** Refer to our [video](link-to-youtube) for a visual guide on getting started with Joomla. This video covers the basics and provides useful tips for a smooth experience.
- **Forums and Community Support:** Join our active [community forums](https://forum.joomla.com/) to engage in discussions, ask questions, and seek assistance from fellow Joomla users. It's a great place to share experiences and learn from the community.
