import 'package:flutter/material.dart';
import 'package:frontend/core/theme/constant/app_icons.dart';

class NaverIcon extends StatelessWidget {
  const NaverIcon({super.key});

  @override
  Widget build(BuildContext context) {
    return InkWell(
      onTap: () {},
      child: Image.asset(AppIcons.naver_icon,
          width: MediaQuery.of(context).size.width * 0.05),
    );
  }
}
